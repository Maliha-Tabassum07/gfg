package DSA.check_if_two_arrays_are_equal_or_not;

import java.util.HashMap;

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long, Integer> aHash = new HashMap<Long, Integer>();
        HashMap<Long, Integer> bHash = new HashMap<Long, Integer>();
        for(long key: A){
            if(aHash.containsKey(key)){
                aHash.put(key, aHash.get(key) + 1);
            }
            else{
                aHash.put(key, 1);
            }
        }
        for(long key: B){
            if(bHash.containsKey(key)){
                bHash.put(key, bHash.get(key) + 1);
            }
            else{
                bHash.put(key, 1);
            }
        }
        return aHash.equals(bHash);
    }
}
