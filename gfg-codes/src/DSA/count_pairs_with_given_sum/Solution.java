package DSA.count_pairs_with_given_sum;


import java.util.HashMap;

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        //     int count=0;
        //     for(int i=0;i<n;i++){
        //         for(int j=i+1;j<n;j++){
        //             if(arr[i]+arr[j]==k){
        //                 count++;
        //             }
        //         }
        //     }
        //     return count;
        // }
        HashMap<Integer, Integer> frequency= new HashMap<Integer, Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            if(frequency.containsKey(k-arr[i])){
                count += frequency.get(k - arr[i]);
            }
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
