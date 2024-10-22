class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int totalSum = 0, sum = 0;

        for(int i = 1; i <= n; i++)
        {
            totalSum = totalSum + i;
        }

        for(int i : nums)
        {
            sum = sum + i;
        }

        return (totalSum - sum);
    }
}