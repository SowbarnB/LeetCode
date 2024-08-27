class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        Stack<String> st = new Stack<>();

        for(String i : words)
        {
            st.push(i);
        }

        StringBuilder reversed = new StringBuilder();

        while (!st.isEmpty()) 
        {
            reversed.append(st.pop());

            if(!st.isEmpty()) 
            {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}

//timecomplexity: O(n)