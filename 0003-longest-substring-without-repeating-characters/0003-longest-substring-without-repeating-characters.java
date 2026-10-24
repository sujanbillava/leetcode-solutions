class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int maxlength=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            int length=right-left+1;
            maxlength=Math.max(maxlength,length);
        }
        return maxlength;
        
    }
}