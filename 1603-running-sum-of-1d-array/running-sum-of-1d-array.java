class Solution {
    public int[] runningSum(int[] nums) {

        int sum = 0; 
        

        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
            nums[i] = 0;
            nums[i] = sum;
        }

        return nums;
    }
}

//timecomplexity: O(n)
//spacecomplexity: O(1)