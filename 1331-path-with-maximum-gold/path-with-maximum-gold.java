class Solution {
public int getMaximumGold(int[][] grid) {
    int ans = 0;
    for(int i=0; i<grid.length; i++){
    for(int j=0; j<grid[0].length; j++){
        if(grid[i][j]!=0){
            ans = Math.max(ans, helper(grid, i, j, new boolean[grid.length][grid[0].length]));  
        }
    }
}
    return ans;
}

int[] x = {-1, 0, 0, 1};
int[] y = {0, -1, 1, 0};

int helper(int[][] grid, int row, int col, boolean[][] visited){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length ||visited[row][col] || grid[row][col] == 0) {
    return 0;
}

    visited[row][col] = true;
    int totalGold = grid[row][col];

        for(int i=0; i<4; i++){
            int newX = x[i] + row;
            int newY = y[i] + col;
            totalGold = Math.max(totalGold, grid[row][col] + helper(grid, newX, newY, visited));
}

    visited[row][col] = false; // Reset visited for backtracking
    return totalGold;
    }
}