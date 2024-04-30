class Solution {
    public int minOperations(int[] nums, int k) {
        int result = 0;

        for(int num : nums)
        {
            result = result ^ num;
        }
        int ans = 0;
        while(k > 0 || result > 0)
        {
            if((k & 1) != (result & 1))
            {
                ans++;
            }
            k >>= 1;
            result >>= 1;
        }
    
        return ans;
    }
}
//timecomplexity : O(n)