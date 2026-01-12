class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length ==1)return nums[0];
        
        for(int i=0;i<nums.length;i++){
            boolean k=true;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    k=false;
                    break;
                }
            }
            if(k){
                return nums[i];
            }
        }
        return 0;
    }
}