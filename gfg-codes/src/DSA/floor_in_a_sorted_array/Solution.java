package DSA.floor_in_a_sorted_array;

class Solution {

    static int findFloor(int[] arr, int k) {
        for (int i=0;i<arr.length;i++){
            if(arr[i]>k) return i-1;
        }
        return -1;
    }
}
