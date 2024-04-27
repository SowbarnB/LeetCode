class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while(n >= 10)
        {
            int digit = n % 10; //4 //3 //2
            product = product * digit; //4 *  3 * 2
            sum = sum + digit; //4 + 3 + 2
            n = n / 10; //23 // 2 //0
        }
        product = product * n;
        sum = sum + n;
        return (product - sum);
    }
}
//timexomplexity : O(n)