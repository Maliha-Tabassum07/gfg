package DSA.majority_element;

//User function Template for Java

import java.util.HashMap;
import java.util.Map;

class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer, Integer> aHash = new HashMap<Integer, Integer>();
        for(int key: a){
            if(aHash.containsKey(key)){
                aHash.put(key, aHash.get(key) + 1);
            }
            else{
                aHash.put(key, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : aHash.entrySet()) {
            if(entry.getValue()>size/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
