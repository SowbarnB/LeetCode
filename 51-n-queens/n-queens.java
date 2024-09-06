class Solution {

    public List<List<String>> solveNQueens(int n) {
        
        char board[][] = new char[n][n];

        List<List<String>> res = new ArrayList<>();

        Set<Integer> col = new HashSet<>();
        Set<Integer> posDiag = new HashSet<>();
        Set<Integer> negDiag = new HashSet<>();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                board[i][j] = '.';
            }
        }

        backtrack(0, n, board, res, col, posDiag, negDiag);

        return res;
    }
    private void backtrack(int r, int n, char board[][], List<List<String>> res,Set<Integer> col, Set<Integer> posDiag, Set<Integer> negDiag)
    {
        if(r >= n)
        {
            List<String> currentboard = new ArrayList<>();
            for(int i = 0; i < n; i++)
            {
                currentboard.add(new String(board[i]));
            }
            res.add(currentboard);
            return;
        }


        for(int c = 0; c < n; c++)
        {
            if(col.contains(c) || posDiag.contains(r + c) || negDiag.contains(r - c))
            {
                continue;
            }

            col.add(c);
            posDiag.add(r + c);
            negDiag.add(r - c);
            board[r][c] = 'Q';

            backtrack(r + 1, n, board, res, col, posDiag, negDiag);

            col.remove(c);
            posDiag.remove(r + c);
            negDiag.remove(r - c);
            board[r][c] = '.';
        }
    }
}