class Solution {
    public int maxSubArray(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0; 
        for(int i = 0; i < n; i++)
        {
            sum = sum + nums[i];

            if(sum > maxi)
            {
                maxi = sum;
            }

            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}