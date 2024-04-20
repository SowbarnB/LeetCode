class Solution {
    public int diagonalSum(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i == j || i == mat.length - j - 1){
                    count += mat[i][j];
                    System.out.println(mat[i][j]);
                }
            }
        }
        return count;
    }
}