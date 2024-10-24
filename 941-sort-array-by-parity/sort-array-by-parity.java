class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n - 1; i++)
        {
            int ele = i;
            for(int j = i + 1; j < n; j++)
            {
                if(nums[ele] % 2 != 0)
                {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}