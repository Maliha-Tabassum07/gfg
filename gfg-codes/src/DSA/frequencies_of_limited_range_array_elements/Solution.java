package DSA.frequencies_of_limited_range_array_elements;

import java.util.HashMap;

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer, Integer> count=new HashMap<Integer,Integer>();
        for(int i=0;i<N;i++){
            if(count.containsKey(arr[i])){
                count.put(arr[i],count.getOrDefault(arr[i],0)+1);
            }
            else{
                count.put(arr[i],1);
            }
        }
        for(int i=0;i<N;i++){
            if(count.containsKey(i+1)){
                arr[i]=count.get(i+1);
            }
            else{
                arr[i]=0;
            }
        }
    }
}
