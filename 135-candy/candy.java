class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] nums = new int[n];

        // Initialize each student's candy count to 1
        Arrays.fill(nums, 1);

        // First pass (left to right)
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                nums[i] = nums[i - 1] + 1;
            }
        }

        // Second pass (right to left)
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                nums[i] = Math.max(nums[i], nums[i + 1] + 1);
            }
        }

        // Sum up all the candies
        int sum = 0;
        for (int k : nums) {
            sum += k;
        }
        return sum;
    }
}
