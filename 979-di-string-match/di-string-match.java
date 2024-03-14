class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();

        int perm[] = new int[n + 1];

        int l = 0;
        int r = perm.length;

        for(int i = 0; i < r - 1; i++)
        {
            if(s.charAt(i) == 'I')
            {
                perm[i] = l;
                l++;
            }
            else
            {
                perm[i] = n;
                n--;
            }
        }
        perm[r - 1] = l;
        return perm;
    }
}