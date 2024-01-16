package DSA.maximum_of_all_subarrays_of_size_k;

import java.util.ArrayList;

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> result=new ArrayList<>();

        for(int i=0;i<=n-k;i++){
            Integer max= -1;
            for (int j=i;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            result.add(max);
        }
        return result;
    }
}
