package DSA.kth_smallest_element;

import java.util.Arrays;

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
