class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
        //n = 1            1 & (0) == 0  //true
        //n = 16           16 & (15) = 10000 & (01111) == 0 //true
    }
}
//timecomplexity: O(1);