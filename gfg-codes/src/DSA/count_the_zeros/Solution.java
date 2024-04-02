package DSA.count_the_zeros;

class Solution {
    int countZeroes(int[] arr, int n) {
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                return n-i;
            }
        }
        return 0;
    }

}

