class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i : score)
        {
            max = Math.max(i, max);
        }

        int totalrank[] = new int[max + 1];

        for(int i = 0; i < score.length; i++)
        {
            totalrank[score[i]] = i + 1;
        }

        int rank = 1;
        String ran[] = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String ans[] = new String[score.length];
        for(int i = max; i >= 0; i--)
        {
            if(totalrank[i] != 0)
            {
                if(rank <= 3)
                {
                    ans[totalrank[i] - 1] = ran[rank - 1];
                }
                else
                {
                    ans[totalrank[i]-1] = rank + "";
                }
                rank++;
            }
        }
        return ans;
    }
}
//timecomplexity: O(n)