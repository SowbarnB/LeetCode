class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        backtract(resultList, new ArrayList<>(), nums);
        return resultList;

    }

    private void backtract(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {

        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for (int number : nums) {

            if (tempList.contains(number)) {
                continue;
            }
            tempList.add(number);
            backtract(resultList, tempList, nums);
            tempList.remove(tempList.size() - 1);

        }
    }
}