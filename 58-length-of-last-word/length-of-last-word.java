class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();

        int end = len - 1;
        int ans = 0;

        while(s.charAt(end) == ' ')
        {
            end--;
        }
        while(end >= 0 && s.charAt(end) != ' ')
        {
            ans++;
            end--;
        }
        return ans;
    }
}