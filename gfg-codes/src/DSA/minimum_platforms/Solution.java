package DSA.minimum_platforms;

import java.util.Arrays;

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int maxCount=1;
        int platform=1;
        int j=0;
        int i=j+1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                maxCount++;
                i++;
            }
            else{
                maxCount--;
                j++;
            }
            if(maxCount>platform){
                platform =maxCount;
            }
        }
        return platform;
    }

}
