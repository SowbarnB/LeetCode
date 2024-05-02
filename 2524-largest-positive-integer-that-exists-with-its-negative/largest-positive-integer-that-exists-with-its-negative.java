class Solution {
    public int findMaxK(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums.length; j++) 
            {
                if(nums[i] == (nums[j] * -1))
                {
                    return nums[j];
                }
            }
        }
        return -1;
    }
}

//timecomplexity : O(n log n)