class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int n = grid.length - 2;

        int result[][] = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int max = grid[i][j];

                for(int iInner = i; iInner <= i + 2; iInner++)
                {
                    for(int jInner = j; jInner <= j + 2; jInner++)
                    {
                        if(grid[iInner][jInner] > max)
                        {
                            max = grid[iInner][jInner];
                        }
                    }
                }
                result[i][j] = max;
            }
        }
        return result;
    }
}
//timecomplexity: O(n^2)