package DSA.first_element_to_occur_k_times;

import java.util.HashMap;

class Solution
{
    public int firstElementKTime(int n, int k, int[] a) {
        HashMap<Integer, Integer> frequency=new HashMap<Integer, Integer>();
        for(int i =0;i<n;i++){
            if(frequency.containsKey(a[i])){
                if(frequency.get(a[i]).equals(k-1)){
                    return a[i];
                }
            }
            frequency.put(a[i],frequency.getOrDefault(a[i],0)+1);
        }
        return -1;
    }
}
