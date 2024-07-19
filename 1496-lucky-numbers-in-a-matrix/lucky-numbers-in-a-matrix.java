class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row_maximum_of_minimums = 0;
        for (int[] row : matrix) {
            int row_minimum = Arrays.stream(row).min().getAsInt();
            row_maximum_of_minimums = Math.max(row_maximum_of_minimums, row_minimum);
        }

        int col_minimum_of_maximums = Integer.MAX_VALUE;
        for (int col_ind = 0; col_ind < cols; ++col_ind) {
            int col_maximum = 0;
            for (int row_ind = 0; row_ind < rows; ++row_ind) {
                col_maximum = Math.max(col_maximum, matrix[row_ind][col_ind]);
            }
            col_minimum_of_maximums = Math.min(col_minimum_of_maximums, col_maximum);
        }

        return row_maximum_of_minimums == col_minimum_of_maximums ? Collections.singletonList(col_minimum_of_maximums) : Collections.emptyList();
    }
}
//timecomplexity: O(n * m)