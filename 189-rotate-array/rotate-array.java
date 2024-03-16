class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i]; //[5, 6, 7]
        }

        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k]; //[1,2,3,1,2,3,4]
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i]; //[5, 6, 7, 1, 2, 3, 4]
        }
    }
}
