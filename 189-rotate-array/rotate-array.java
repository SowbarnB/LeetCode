class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }
}
