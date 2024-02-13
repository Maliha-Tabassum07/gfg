package DSA.value_equal_to_index_value;

import java.util.ArrayList;

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<n;i++){
            if((i+1)==arr[i]){
                result.add(i+1);
            }
        }
        return result;
    }
}
