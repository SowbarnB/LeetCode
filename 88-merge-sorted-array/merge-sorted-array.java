class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int l = 0;
        int r = 0;

        int arr[] = new int[999];

        while (l < m && r < n) {
            if (nums1[l] < nums2[r]) {
                arr[i] = nums1[l];
                i++;
                l++;
            } else {
                arr[i] = nums2[r];
                i++;
                r++;
            }
        }

        while (l < m) {
            arr[i] = nums1[l];
            i++;
            l++;
        }
        while (r < n) {
            arr[i] = nums2[r];
            i++;
            r++;
        }
        
       System.arraycopy(arr, 0, nums1, 0, m + n);
    }
}