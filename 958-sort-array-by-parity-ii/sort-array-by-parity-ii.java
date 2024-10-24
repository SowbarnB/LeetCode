class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         int i = 0;
         int j = 1;

        while(i < nums.length && j < nums.length)
        {
            while(nums[i] % 2 != 0 && nums[j] % 2 == 0)
            {
                int temp = nums[i];
                nums[i]  = nums[j];
                nums[j] = temp;
            }

            if(nums[i] % 2 == 0)
            {
                i += 2;
            }
            else
            {
                j += 2;
            }
        }
        return nums;
    }
}