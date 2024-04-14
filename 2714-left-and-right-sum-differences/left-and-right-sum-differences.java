class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int right = 0;
        for (int i : nums){
            right += i;
        }
        int result[] = new int[n];
        int left = 0;
        for (int i = 0; i < n; i++){
            right -= nums[i];
            result[i] = Math.abs(right - left);
            left += nums[i];
        }
        return result;
    }
}