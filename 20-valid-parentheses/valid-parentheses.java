class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i : s.toCharArray())
        {
            if(i == '(')
            {
                st.push(')');
            }
            else if(i == '{')
            {
                st.push('}');
            }
            else if (i == '[')
            {
                st.push(']');
            }
            else if(st.isEmpty() || st.pop() != i)
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}