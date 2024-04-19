package DSA.find_triplets_with_zero_sum;

import java.util.Arrays;

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
    public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    return true;
                }
                else if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
            }
        }
        return false;
    }
}
