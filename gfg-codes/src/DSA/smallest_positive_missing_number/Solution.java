package DSA.smallest_positive_missing_number;

import java.util.Arrays;

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        int missing=1;
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            if(arr[i]==missing){
                missing++;
            }
        }
        return missing;
    }
}
