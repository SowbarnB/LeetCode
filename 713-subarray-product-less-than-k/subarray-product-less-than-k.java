class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, result = 0, left = 0,product = 1;

        for(int right = 0; right < n; right++)
        {
            product = product * nums[right];
            while(product >= k && left <= right)
            {
                product = product / nums[left];
                left++;
            }
            result = result + right - left + 1;
        }
        return result;
    }
}