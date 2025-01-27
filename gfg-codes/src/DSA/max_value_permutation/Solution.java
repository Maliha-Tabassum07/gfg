package DSA.max_value_permutation;

import java.util.Arrays;

class Solution {

    int maxValue(int arr[]) {
        int MOD=1000000007;
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum = (sum + ((long)arr[i] * i))% MOD ;
        }
        return (int)sum;
    }
}
