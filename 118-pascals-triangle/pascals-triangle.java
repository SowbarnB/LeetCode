class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        triangle.add(first);

        for(int i = 1; i < numRows; i++)
        {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1);

            for(int j = 1; j < i; j++)
            {
                row.add(prevRow.get(j) + prevRow.get(j - 1));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}