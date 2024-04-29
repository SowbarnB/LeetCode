class Solution {
    public int tribonacci(int n) {
        int t0 = 0, t1 = 1, t2 = t0 + t1, T = 0;
        if(n == 0)
        {
            return 0;
        }
        else if(n == 1 || n == 2)
        {
            return 1;
        }
        else
        {
            for(int i = 2; i < n; i++)
            {
                T = t0 + t1 + t2; // 2
                t0 = t1;
                t1 = t2;
                t2 = T;
            }
        }
        return T;
    }
}
//timecomplexity : O(n)