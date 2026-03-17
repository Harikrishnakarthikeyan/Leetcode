class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        List<Integer> li=new ArrayList<>();
        while(i<arr.length){
            int correct=arr[i]-1;
            if(correct< arr.length&& arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                li.add(j+1);
            }
        }
        return li;
    
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}