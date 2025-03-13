package DSA.find_pair_given_difference;

import java.util.Arrays;

class Solution {
    public boolean findPair(int[] arr, int x) {
        Arrays.sort(arr);

        if(arr.length<=1){
            return false;
        }
        int left=0;
        int right=left+1;
        while (left<right && right<arr.length){
            if(Math.abs(arr[left]-arr[right])==x) return true;
            if(Math.abs(arr[left]-arr[right])<x){ right++;}
            else{
                left++;
                if(left==right){
                    right=left+1;
                }
            }

        }
        return false;
    }
}
