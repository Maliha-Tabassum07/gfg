package DSA.check_if_array_is_sorted;


class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {

        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
