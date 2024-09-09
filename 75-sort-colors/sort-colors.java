class Solution {
    public void sortColors(int[] nums) {

        int zero = 0, one = 0, two = 0;
        

        for(int i : nums)
        {
            if(i == 0) zero++;
            else if(i == 1) one++;
            else two++;
        }

        for(int i = 0; i < zero; i++)
        {
            nums[i] = 0;
        }
        for(int i = zero; i < one + zero; i++)
        {
            nums[i] = 1;
        }
        for(int i = one + zero; i < two + one + zero; i++)
        {
            nums[i] = 2;
        }
    }
}
//timecomplexity: O(n)
//spacecomplexity: O(1)
