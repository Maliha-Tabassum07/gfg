package DSA.key_pair;

import java.util.HashMap;

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashMap<Integer, Integer> frequency= new HashMap<Integer, Integer>();
        int count=0;
        for(int i=0;i<n;i++){
            if(frequency.containsKey(x-arr[i])){
                return true;
            }
            frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
        }
        return false;
    }
}
