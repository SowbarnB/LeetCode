class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> map= new HashMap();

        int preSum = 0, count = 0;

        map.put(0, 1);

        for(int i = 0; i < nums.length; i++)
        {
            preSum = preSum + nums[i];
            int remove = preSum - k;
            count = count + map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        } 
        return count;
    }
}