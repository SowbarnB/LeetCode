class Solution {
    public int addDigits(int num) {
        
        if(num < 10)
        {
            return num;
        }

        if(num > 9)
        {
            num = (num - 1) % 9 + 1;
        }

        return num;
    }
}