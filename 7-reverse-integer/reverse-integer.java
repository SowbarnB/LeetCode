class Solution {
    public int reverse(int x) {

        long reversed = 0;

        while(x != 0)
        {
            int digit = x % 10;  //3 //2 //1
            reversed = reversed * 10 + digit; //3 //2 //1
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
            {
                return 0;
            }
            x = x / 10; //12 //1
        }

        return (int)reversed;
    }
}