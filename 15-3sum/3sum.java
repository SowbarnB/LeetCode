class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        List<List<Integer>> li = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) 
        {
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = nums.length - 1;

            while (j < k) 
            {
                int ans = nums[i] + nums[j] + nums[k];
                if (ans == 0) 
                {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);

                    if (set.add(triplet)) 
                    {
                        li.add(triplet);
                    }
                    j++;
                    k--;
                } 
                else if (ans > 0) 
                {
                    k--;
                } 
                else 
                {
                    j++;
                }
            }
        }
        return li;
    }
}
//timecomplexity: O(n^2)
//spacecomplexity: O(n)
