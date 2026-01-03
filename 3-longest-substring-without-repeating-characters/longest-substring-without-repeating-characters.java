class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> list=new HashSet<>();
        int start=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            while(list.contains(s.charAt(i))){
                
                list.remove(s.charAt(start));
                start++;
            }
            list.add(s.charAt(i));
            if(list.size()>maxLen){
                    maxLen=list.size();
                }
        }
    return maxLen;
    }
}