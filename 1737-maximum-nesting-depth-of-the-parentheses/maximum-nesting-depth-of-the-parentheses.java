class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maximum = 0;

        for(char a : s.toCharArray())
        {
            if(a == '(')
            {
                count++;
            }
            if(a == ')')
            {
                count--;
            }
            maximum = Math.max(count, maximum);
        }
        return maximum;
    }
}