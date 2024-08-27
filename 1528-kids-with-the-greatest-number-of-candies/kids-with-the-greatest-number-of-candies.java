class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandy = 0; //2 //3 //5 //5 //5

        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] > maxCandy)
            {
                maxCandy = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] + extraCandies >= maxCandy)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}
//timecomplexity: O(n)