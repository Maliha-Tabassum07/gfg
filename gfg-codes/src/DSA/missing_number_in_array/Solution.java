package DSA.missing_number_in_array;

import java.util.Arrays;

class Solution {
    int missingNumber(int array[], int n) {
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if((i+1)!=array[i]){
                return i+1;
            }
        }
        return array.length+1;
    }
}
