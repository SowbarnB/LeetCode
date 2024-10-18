class Solution {
    public String convert(String s, int numRows) {

        String arr[] = new String[numRows];
        if(numRows == 1) return s;

        for(int i = 0; i < numRows; i++)
        {
            arr[i] = "";
        }

        int currRow = 0;
        boolean goDown = false;

        for(int i = 0; i < s.length(); i++)
        {
            arr[currRow] = arr[currRow] + s.charAt(i);

            if(currRow == 0 || currRow == numRows - 1)
            {
                goDown = !goDown;
            }
            
            if(goDown)
            {
                currRow++;
            }
            else
            {
                currRow--;
            }
        }
        String result = "";
        for(String i : arr)
        {
            result = result + i;
        }
        return result;
    }
}