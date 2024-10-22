class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int count = 0, candidate = 0;

        for(int i : nums)
        {
            if(count == 0)
            {
                candidate = i; 
            }

            if(i == candidate)
            {
                count = count + 1; 
            }
            else 
            {
                count = count - 1; 
            }
        }
        return candidate;
    }
}

//timecomplexity: O(n)
//spacecomplexity: O(1)