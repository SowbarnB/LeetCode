class Solution {
    public boolean isAnagram(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        if(m != n)
        {
            return false;
        }
            
        char s1[] = s.toCharArray();
        char t2[] = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t2);

        for(int i = 0; i < m; i++)
        {
            if(s1[i] != t2[i])
            {
                return false;
            }
        }
        return true;
    }
}