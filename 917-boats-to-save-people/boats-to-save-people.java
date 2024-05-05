class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat = 0;

        Arrays.sort(people); //1,2,2,3

        int i = 0, j = people.length - 1; 

        while(i <= j)
        {
            if(people[i] + people[j] <= limit)
            {
                i++;
            }
            j--;
            boat++;
        }
        return boat;
    }
}
//time complexity : O(n log n)