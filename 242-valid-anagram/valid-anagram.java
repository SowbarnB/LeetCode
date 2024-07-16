class Solution {
    public boolean isAnagram(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        if(m != n)
        {
            return false;
        }
            
        int count[] = new int[26];

        for(int i = 0; i < m; i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i : count)
        {
            if(i != 0) return false;
        }

        return true;
    }
}
//timecomplexity: O(n)