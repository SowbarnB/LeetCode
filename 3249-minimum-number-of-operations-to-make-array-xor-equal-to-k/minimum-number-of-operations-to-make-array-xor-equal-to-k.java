class Solution {
    public int minOperations(int[] nums, int k) {
        int result = 0;

        for(int num : nums)
        {
            result = result ^ num; //2 //3 //0  //4
        }
        int ans = 0;
        while(k > 0 || result > 0)
        {
            if((k & 1) != (result & 1)) //(1,0) (0,0) (0,1)
            {
                ans++;  //1 //2
            }
            k >>= 1; //0000  
            result >>= 1; //0010 //0001 //0000
        }
    
        return ans;
    }
}
//timecomplexity : O(n)