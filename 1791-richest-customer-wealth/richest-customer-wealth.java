class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int[] nums:accounts){
            int ans=add(nums);
            if(ans>max){
                max=ans;
            }    
        
        }
        return max;
    }
    int add(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    }
}