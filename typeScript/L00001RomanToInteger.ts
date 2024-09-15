function romanToInt(s: string): number {
    const romanSym:{[key: string]:number} = {
        "I" : 1,
        "V" : 5,
        "X" : 10,
        "L" : 50,
        "C" : 100,
        "D" : 500,
        "M" : 1000
    }
    let num: number = 0;
    let prevValue: number = 0;
    for (let i = s.length-1; i >= 0; i--){
        const curChar = s[i];
        const curValue = romanSym[curChar];
        if (curValue < prevValue) {
            num -= curValue;
        } else {
            num += curValue;
        }

        prevValue = curValue;
    }
    return num;
}

const s = "MCMXCIV";
let toInt = romanToInt(s);
console.log(toInt);