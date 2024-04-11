import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each digit of the number
        for (char digit : num.toCharArray()) {
            // Remove digits from the stack as long as the current digit is smaller
            // and there are remaining removals allowed
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        // Remove remaining k digits from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        // Construct the resulting string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop()); // Insert each digit at the beginning of the StringBuilder
        }
        
        // Remove leading zeros
        int nonZeroIndex = 0;
        while (nonZeroIndex < sb.length() && sb.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }
        // If all digits were zeros, return "0"
        if (nonZeroIndex == sb.length()) {
            return "0";
        }
        // Otherwise, return the substring from the first non-zero digit
        return sb.substring(nonZeroIndex);
    }
}
