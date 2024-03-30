class Solution {
    public int[] sumZero(int n) {
        int mid = -(n / 2);
        int arr[] = new int[n];

        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                arr[i] = mid++;
            }
        }
        else {
            for (int i = 0; i < n; i++){
                if (mid == 0){
                    mid++;
                    arr[i] = mid++;
                    continue;
                }
                arr[i] = mid++;
            }
        }
        return arr;
    }
}