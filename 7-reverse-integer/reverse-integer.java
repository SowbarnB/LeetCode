class Solution {
    public int reverse(int x) {
        
        long reversed = 0;

        while(x != 0)
        {
            int digits = x % 10;
            reversed = reversed * 10 + digits;
            if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE)
            {
                return 0;
            }
            x = x / 10;
        }
        return (int) reversed;
    }
}