class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, board.length);
    }
    public boolean solve(char board[][], int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                
                if (board[i][j] == '.'){

                    for (char num = 1; num <= 9; num++){
                        char c = Character.forDigit(num, 10);
                        if (safe(i, j, c, board, n)){
                            board[i][j] = c;
                            if (solve(board, n)){
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean safe(int x, int y, char num, char board[][], int n){
        //For Row check

        for (int i = 0; i < n; i++){
            if (board[x][i] == num){
                return false;
            }        
        //For Column Check
            if (board[i][y] == num){
                return false;
            }
        //For Sub-Matrix check
            if (board[3 * (x / 3) + i / 3][3 * (y / 3) + i % 3] == num){
                return false;
            }
        }
        return true;
    }
}