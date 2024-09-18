let prices:number[]= [7,1,5,3,6,4];
console.log("maxProfit", maxProfit(prices));
function maxProfit(prices: number[]): number {
    let lowPrice = prices[0];
    for(let i = 1 ; i < prices.length; i ++) {
        if(lowPrice > prices[i]){
            lowPrice = prices[i];
        }
    }
    let prevDiff = 0;
    let currDif = 0;
    for (let i = 0; i < prices.length; i++) { //0=7,1=1
        for (let j = i+1; j < prices.length; j++){//2=5,3=3,4=6,5=4
            if(prices[i] < prices[j]){//7<1,5,3,6,4 false 1<5 true
                currDif = prices[j] - prices[i]; //4,2,5,3
            }
            if(currDif > prevDiff){ //4 > 0,2 > 4 false,5 > 4,3 > 5 false
                prevDiff = currDif;//prevDiff= 4,5
            }
        }
        if(prices[i] === lowPrice){
            return prevDiff;
        }
    }
    return prevDiff;
}