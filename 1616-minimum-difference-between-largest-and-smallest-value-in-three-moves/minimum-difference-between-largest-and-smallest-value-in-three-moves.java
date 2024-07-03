class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;

        if(n <= 4) return 0;


        Arrays.sort(nums);

        int last3index = nums[n - 4] - nums[0];
        int first1last2 = nums[n - 3] - nums[1];
        int first2last1 = nums[n - 2] - nums[2];
        int first3 = nums[n - 1] - nums[3];

        int minimumDiff = Math.min(
            Math.min(last3index, first1last2),
            Math.min(first2last1, first3)
        );
        
        return minimumDiff;
    }
}