class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1) return false;
        
        int sum = 1;
        
        for(int i = 2; i <= (int)Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
                if(i != num / i)
                {
                    sum = sum + (num / i);
                }
                if(sum > num) return false;
            }
            
        }
        

        return sum == num;
    }
}

//timecomplexity: O(sqrt(n))
//spacecomplexity: O(1)