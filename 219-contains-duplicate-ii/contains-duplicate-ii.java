class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(mp.containsKey(nums[i]))
            {
                int j = mp.get(nums[i]);
                if(i - j <= k)
                {
                    return true;
                }
            }
            mp.put(nums[i], i);
        }
        return false;
    }
}
//timecomplexity: O(n)
//spacecomplexity: O(n)