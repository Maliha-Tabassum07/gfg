package DSA.find_Kth_rotation;

import java.util.List;

class Solution {
    public int findKRotation(List<Integer> arr) {
        Integer[] integerArray = arr.toArray(new Integer[0]);
        for (int i=1;i<integerArray.length;i++){
            if(integerArray[i]<integerArray[i-1]){
                return i;
            }
        }
        return 0;
    }
}
