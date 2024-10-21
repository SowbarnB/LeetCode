class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while(left <= right)
        {
            char lc = s.charAt(left);
            char rc = s.charAt(right);

            if(!Character.isLetterOrDigit(lc))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(rc))
            {
                right--;
            }
            else
            {
                if(lc != rc) return false;

                left++;
                right--;
            }
        }
        return true;
    }
}