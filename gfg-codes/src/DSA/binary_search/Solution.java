package DSA.binary_search;

class Solution {
    int binarysearch(int arr[], int n, int k) {
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}