class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int count = 0, longest = 0, lastSmaller = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++)
        {
            if(nums[i] - 1 == lastSmaller)
            {
                count = count + 1;
                lastSmaller = nums[i];
            }
            else if(lastSmaller != nums[i])
            {
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}