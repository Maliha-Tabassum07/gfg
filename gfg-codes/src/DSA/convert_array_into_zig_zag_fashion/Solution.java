package DSA.convert_array_into_zig_zag_fashion;

class Solution {
    public void zigZag(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            } else {
                if (a[i] < a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
