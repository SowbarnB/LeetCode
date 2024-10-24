class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(nums[mid] % 2 != 0)
            {
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
            else 
            {
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
            }
        }
        return nums;
    }
}