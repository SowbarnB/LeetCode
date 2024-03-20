class Solution {
    public int[] findArray(int[] pref) {
        int temp[] = new int[pref.length];

        temp[0] = pref[0];

        for(int i = 1; i < pref.length; i++)
        {
            temp[i] = pref[i] ^ pref[i - 1];
        }
        return temp;
    }
}