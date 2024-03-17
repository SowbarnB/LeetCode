class Solution {
    public void moveZeroes(int[] nums) {
        
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                temp.add(nums[i]);  //[1,3,12]
            }
        }

        for(int i = 0; i < temp.size(); i++)
        {
            nums[i] = temp.get(i);  //[1,3,12,_,_]
        }

        for(int i = temp.size(); i < nums.length; i++)
        {
            nums[i] = 0;    //[1,3,12,0,0]
        }
    }
}