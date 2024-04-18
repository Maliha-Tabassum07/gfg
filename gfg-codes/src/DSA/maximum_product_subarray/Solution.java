package DSA.maximum_product_subarray;

class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long maxProduct=Long.MIN_VALUE;
        long prefix=1l;
        long suffix=1l;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix=prefix*(long)arr[i];
            suffix=suffix*(long)arr[n-i-1];
            maxProduct=Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;
    }
}
