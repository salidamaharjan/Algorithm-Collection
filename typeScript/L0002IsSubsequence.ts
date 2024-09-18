const s = "acb";
const t = "ahbgdc";
const findSinT = isSubsequence(s,t);
console.log("findSinT", findSinT);

function isSubsequence(s: string, t: string): boolean {
    let sPointer = 0;
    if(s.length === 0) {
        return true;
    }
    for (let i = 0; i < t.length && sPointer < s.length; i++){
        if(s[sPointer] === t[i]) {
            sPointer += 1;
        }
    }
    return s.length === sPointer;
}