class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> li=new HashSet<>();
        int maxLen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(li.contains(s.charAt(right))){
                li.remove(s.charAt(left));
                left++;
            }
            li.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}