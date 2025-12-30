class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> li=new ArrayList<>();
        int carray=0;
        int i=num.length-1;
        while(i >=0 || k>0){
            int sum=carray;
            if(i>=0){
                sum+=num[i];
                i--;
            }
            if(k>0){
                sum+=k%10;
                k/=10;
            }
            li.add(sum%10);
            carray=sum/10;
        }
        if (carray>0){
            li.add(carray);
        }
Collections.reverse(li);
        return li;
    }
}