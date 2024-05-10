import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        Vector <Integer> visited = new Vector<>();

        while(n != 1 && !visited.contains(n))
        {
            visited.add(n);

            int sum = 0;
            while(n > 0)
            {
                int digits = n % 10;
                sum = sum + digits * digits;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}