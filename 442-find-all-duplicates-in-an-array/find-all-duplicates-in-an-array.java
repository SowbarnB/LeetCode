class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> li = new ArrayList<>();

        for(var entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                li.add(entry.getKey());
            }
        }
        return li;
    }
}