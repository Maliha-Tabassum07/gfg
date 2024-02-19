package DSA.find_unique_element;

import java.util.HashMap;

class Solution {

    public int findUnique(int a[], int n, int k)
    {
        HashMap<Integer, Integer> count=new HashMap<Integer, Integer>();
        for(int key:a){
            if(count.containsKey(key)){
                count.put(key, count.get(key) + 1);
            }
            else{
                count.put(key, 1);
            }
        }
        for(int key: count.keySet()){
            if(count.get(key)%k!=0){
                return key;
            }
        }
        return 0;
    }
}