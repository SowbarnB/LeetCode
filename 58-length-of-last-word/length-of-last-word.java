class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        
        int j = n - 1;
        int count = 0;

        while(s.charAt(j) == ' ')
        {
            j--;
        }

        while(j >= 0 && s.charAt(j) != ' ')
        {
            count++;
            j--;
        }

        return count;
    }
}
//timecomplexity: O(n)
//spacecomplexity: O(1)