/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;
        int peek=findPeek(mountainArr,start,end);
        int ans=binarySearch(start,peek,mountainArr,target,true);
        if(ans==-1)
         ans=binarySearch(peek,end,mountainArr,target,false);
        return ans;
    }
    public int findPeek(MountainArray mountainArr,int start,int end){
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int binarySearch(int start,int end,MountainArray mountainArr,int target,boolean isAsc){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else{
                if(isAsc){
                    if(mountainArr.get(mid)>target){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                else{
                    if(mountainArr.get(mid)<target){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
        }
        return -1;
    }
}