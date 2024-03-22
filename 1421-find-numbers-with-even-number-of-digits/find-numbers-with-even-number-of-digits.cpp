class Solution {
public:
    int findNumbers(vector<int>& nums) {
        
        int n = nums.size();

        int count = 0;
        
        for(int num : nums)
        {
            if(countDigits(num) % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    
    private:

    int countDigits(int num)
    {
        int count = 0;        
        while(num != 0)
        {
            count++;
            num = num / 10;
        }
        return count;
    }
};