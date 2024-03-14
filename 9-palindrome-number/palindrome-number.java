class Solution {
    public boolean isPalindrome(int x) {
        
        String str = Integer.toString(x);

        int n = str.length();

        StringBuilder str2 = new StringBuilder(str). reverse();
        
        int m = str2.length();

        if(n != m)
        {
            return false;
        }

        
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) != str2.charAt(i))
            {
                return false;
            }
        }
        
        return true;
    }
}