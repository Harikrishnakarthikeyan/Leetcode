class Solution {
    public boolean isPalindrome(int x) {
        int rem=0,rev=0,cp=x;
        if(x<0)
        return false;
        
        while(cp>0){
            rem=cp%10;
            rev=(rev*10)+(rem);
            cp/=10;
        }
        if(x==rev)
        return true;
        else
        return false;
    }
}