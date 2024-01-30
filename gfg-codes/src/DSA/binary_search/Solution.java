package DSA.binary_search;

class Solution {
    int binarysearch(int arr[], int n, int k) {
        int left=0;int right= n-1;
        while(left<=right){
            int middle=left+(right-left)/2;
            if (arr[middle]==k){
                return middle;
            }
            if (arr[middle]<k){
                left=middle+1;
            }
            else {
                right=middle-1;
            }

        }
        return -1;
    }
}