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
            }
        }
        System.out.print(sum);

        if(sum == num) return true;

        return false;
    }
}

//timecomplexity: O(sqrt(n))
//spacecomplexity: O(1)