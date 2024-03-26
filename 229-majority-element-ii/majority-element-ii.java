class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            if(ls.size() == 0 || ls.get(0) != nums[i]) //ls 3  
            {
                int count = 0;
                for(int j = 0; j < n; j++)
                {
                    if(nums[j] == nums[i])
                    {
                        count++;  //1 
                    }
                }
                if(count > (n/3))
                {
                    ls.add(nums[i]);  //3 
                }
            }
            if(ls.size() == 2) break;
        }
        return ls;
    }
}