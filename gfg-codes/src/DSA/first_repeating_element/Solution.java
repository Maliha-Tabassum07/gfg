package DSA.first_repeating_element;

import java.util.HashMap;

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer, Integer> count=new HashMap<Integer, Integer>();
        int min=(int)Math.pow(10, 6);
        for(int i=0;i<n;i++){
            if(count.containsKey(arr[i])){
                if(min>count.get(arr[i])){
                    min=count.get(arr[i]);
                }
            }
            else{
                count.put(arr[i],i+1);
            }
        }
        if(min<Math.pow(10, 6)){
            return min;
        }
        return -1;
    }
}
