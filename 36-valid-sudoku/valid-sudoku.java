class Solution {

    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                char currentVal = board[i][j];
                if (currentVal == '.') 
                {
                    continue;
                }

                String rowCheck = currentVal + " in row " + i;
                String colCheck = currentVal + " in column " + j;
                String boxCheck = currentVal + " in box " + (i / 3) + "-" + (j / 3);

                if (!seen.add(rowCheck) || !seen.add(colCheck) || !seen.add(boxCheck)) 
                {
                    return false;
                }
            }
       }
       return true;
    }
}