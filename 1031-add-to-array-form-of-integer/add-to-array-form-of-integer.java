class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li=new ArrayList<>();
    
        int i=num.length-1,sum=0;
        while(i >=0 || k>0){
             
            if(i>=0){
                sum+=num[i];
                i--;
            }
            if(k>0){
                sum+=k%10;
                k/=10;
            }
            li.add(sum%10);
            sum/=10;
        }
        if (sum>0){
            li.add(sum);
        }
Collections.reverse(li);
        return li;
    }
}