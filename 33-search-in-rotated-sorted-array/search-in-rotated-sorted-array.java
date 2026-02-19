class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot==-1)
         return  binarySearch(0,nums.length-1,nums,target);
        if(nums[pivot]==target)
            return pivot;
        if(nums[0]>target)
            return binarySearch(pivot+1,nums.length-1,nums,target);
        return binarySearch(0,pivot-1,nums,target);
        
    } 
    public int binarySearch(int start,int end,int[] nums,int target){
           while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target)
                    end=mid-1;
            else if(nums[mid]<target)
                start=mid+1;
            else
                return mid;
            }
        return -1;
        
    }
    public int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[start]>=nums[mid])
                end=mid-1;
            else
                start=mid+1;

        }
        return -1;
    }
}