class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        int n = chalk.length;
        long sum = 0;

        for(int i = 0; i < n; i++)
        {
            sum = sum + chalk[i]; //11
        }

        while(k >= sum)
        {
            k = (int)(k - sum);
        }

        for(int i = 0; i < n; i++)
        {
            if(chalk[i] > k)
            {
                return i;
            }
            else
            {
                k = k - chalk[i];
            }
        }
        return -1;
    }
}