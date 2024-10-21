class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0 || 1162261467 % n != 0) return false;

        return true;
    }
}
//timecomplexity: O(1)
//spacecomplexity: O(1)