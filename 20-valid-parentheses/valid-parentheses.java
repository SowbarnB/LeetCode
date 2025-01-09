class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

        for(char i : s.toCharArray())
        {
            if(i == '(' || i == '{' || i == '[')
            {
                st.push(i);
            }
            else
            {
                if(st.isEmpty()) return false;

                char op = st.pop();
                if((op == '(' && i == ')') || (op == '[' && i == ']') || (op == '{' && i == '}'))
                {
                    continue;
                }
                else return false;
            }

        }
        return st.isEmpty();
    }
}