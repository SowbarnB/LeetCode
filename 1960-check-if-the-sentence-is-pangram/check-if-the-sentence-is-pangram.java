class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int n = sentence.length();

        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            if(!sentence.contains(String.valueOf(ch)))
            {
                return false;
            }
        }
        return true;
    }
}
//timecomplexity: O(n)
//spacecomplexity: O(1)