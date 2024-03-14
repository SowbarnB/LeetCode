class Solution {
    public String firstPalindrome(String[] words) {
        


        for(String c : words)
        {
            String reversedword = new StringBuilder(c).reverse().toString();
            if(c.equals(reversedword))
            {
                return c;
            }
        }
        return "";
    }
}