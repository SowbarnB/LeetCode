class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ch)
            {
                index = i;
                break;
            }
        }

        for(int i = index; i >= 0; i--)
        {
            str.append(word.charAt(i));
        }

        for(int i = index + 1; i < word.length(); i++)
        {
            str.append(word.charAt(i));
        }
        return str.toString();
    }
}
///timecomplexity : O(n)