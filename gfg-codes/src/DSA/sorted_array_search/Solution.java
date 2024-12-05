package DSA.sorted_array_search;

class Solution {
    static boolean searchInSorted(int arr[], int k) {
        for(int i=0; i<arr.length;i++){
            if(arr[i]==k)return true;
            if(arr[i]>k)return false;
        }
        return false;
    }
}