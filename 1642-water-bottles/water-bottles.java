class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int tot=numBottles;
        
        while(numBottles>=numExchange){
            int num=numBottles/numExchange;
            int rem=numBottles%numExchange;
            tot=tot+num;
            numBottles=num+rem;
            
    }
        
        
        return tot;
    }
}