class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; //3
        int n = matrix[0].length; //4
        System.out.print(m + " " + n);

        int k = 0, l = 0, I = 0;
        int totalElements = m * n;

        ArrayList<Integer> al = new ArrayList<>();

        while(k < m && l < n)
        {

            for(int i = l; i < n && I < totalElements; i++)
            {
                al.add(matrix[k][i]);
                I++;
            }
            k++;

            for(int i = k; i < m && I < totalElements; i++)
            {
                al.add(matrix[i][n - 1]);
                I++;
            }
            n--;
            for(int i = n - 1; i >= l && I < totalElements; i--)
            {
                al.add(matrix[m - 1][i]);
                I++;
            }
            m--;

            for(int i = m - 1; i >= k && I < totalElements; i--)
            {
                al.add(matrix[i][l]);
                I++;
            }
            l++;
        }

        return al;
    }
}