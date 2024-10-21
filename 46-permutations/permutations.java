class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void perm(int[] nums,int f,int n)
    {
        if(f == n)
        {
            List<Integer> curr = new ArrayList<>();
            for(int i : nums)
            {
                curr.add(i);
            }
            result.add(curr);
            return;
        }
        for(int i = f; i <= n; i++)
        {
            if(i != f) swap(nums, i, f);
            perm(nums, f + 1, n);
            if(i != f) swap(nums, i, f);
        }
    }

    void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        perm(nums, 0, nums.length-1);
        return result;
    }
}
//timecomplexity: O(n!)
//spacecomplexity: O(n!)