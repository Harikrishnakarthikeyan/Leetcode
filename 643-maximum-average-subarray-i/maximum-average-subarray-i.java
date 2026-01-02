class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0d;
        double max=0d;
        double sum=0d;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            if(max<sum)
                max=sum;
        }
        avg=max/k;
        return avg;
    }
}