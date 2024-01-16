package DSA.bitonic_point;

class Solution {
    int findMaximum(int[] arr, int n) {
        Integer max= -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                return max;
            }
        }
        return arr[n-1];
    }
}
