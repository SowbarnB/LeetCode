class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(!st.empty() && Math.abs(c - st.peek()) == 32)
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty())
        {
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }
}