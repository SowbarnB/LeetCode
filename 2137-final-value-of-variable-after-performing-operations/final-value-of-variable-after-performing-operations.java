class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int num = 0;

        for(String c : operations)
        {
           if(c.equals("++X") || c.equals("X++"))
           {
               num++;
           }
           else
           {
               num--;
           }
        }
        return num;
    }
}