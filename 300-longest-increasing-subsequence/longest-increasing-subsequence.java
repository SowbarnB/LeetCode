class Solution {
    public int lengthOfLIS(int[] arr) {
    
    int size = arr.length;

    int dp[] = new int[size];
    
    for(int k = 0; k < size; k++)
    {
        dp[k] = 1;
    }
    
    int i = 1, j = 0;
    
    while(i < size)
    {
        if(arr[j] < arr[i])
        {
            if(dp[i] < (dp[j] + 1))
            {
                dp[i] = (dp[j] + 1);
            }
        }
        
        j++;
        
        if(i == j)
        {
            i++;
            j = 0;
        }
    }
    
    int max = dp[0];
    
    for(int k = 0; k < size; k++){
        if(dp[k] > max){
            max = dp[k];
        }
    }
    return max;
}
    }