class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int ans;
        int n1,n2;
        n1=nums[nums.length-1];
        n2=nums[nums.length-2];
        ans=(n1-1)*(n2-1);
        return ans;
    }
}