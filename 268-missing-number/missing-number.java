class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int flag;

        for(int i = 0; i <= n; i++)
        {
            flag = 0;
            for(int j = 0; j < n; j++)
            {
                if(nums[j] == i)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                return i;
            }
        }
    return 0;
    }
}