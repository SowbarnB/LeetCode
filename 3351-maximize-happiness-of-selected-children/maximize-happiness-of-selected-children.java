class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        Arrays.sort(happiness);

        long sum = 0;

        int count = 0;

        for(int i = happiness.length - 1; i >= 0; i--)
        {
            if(count == k)
            {
                break;
            }
            sum = sum + Math.max(0, happiness[i] - count);
            count++;
        }        
        
        return sum;
    }
}
//timecomplexity: O(n log n)