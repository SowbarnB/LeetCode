class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];

        //finding the prefixSum array
        prefixSum[0] = nums[0];
        for(int i=1; i<n; i++)
        {
            prefixSum[i] = prefixSum[i-1] + nums[i];
            System.out.print(prefixSum[i] + " ");
        }

        //finding the suffixSum array
        suffixSum[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--)
        {
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }

        for(int i=0; i<n; i++)
        {
            if(prefixSum[i]==suffixSum[i])
            {
                return i;
            }
        }

        return -1;
    }
}
//timecomplexity: O(n)
//spacecomplexity: O(n)