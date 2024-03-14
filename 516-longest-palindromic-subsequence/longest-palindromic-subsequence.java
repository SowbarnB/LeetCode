class Solution {
    public int longestPalindromeSubseq(String s) {
        
        StringBuilder st = new StringBuilder(s).reverse(); 

        int m = s.length();
        int n = st.length();

        int dp[][] = new int[m + 1][n + 1];

        for(int i = 0; i <= m; i++)
        {
            dp[i][0] = 0;
        }

        for(int j = 0; j <= n; j++)
        {
            dp[0][j] = 0;
        }

        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(s.charAt(i - 1) == st.charAt(j - 1))
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}