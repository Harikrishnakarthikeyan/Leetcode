class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] a={-1,-1};
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
                
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                a[0]=nums[j];
                a[1]=j+1;
            }
        }
        return a;
    }
}