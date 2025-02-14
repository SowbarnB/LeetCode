class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        int low = 0, high = n - 1;
        int ans = Integer.MAX_VALUE;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(nums[low] <= nums[mid])
            {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
                ans = Math.min(ans, nums[mid]);
            }
        }
        return ans;
    }
}
//timecomplexity: O(log n)
//spacecomplexity: O(1)