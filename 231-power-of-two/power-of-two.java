class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0 || 1073741824 % n != 0 || n < 0 ) return false;

        return true;
    }
}