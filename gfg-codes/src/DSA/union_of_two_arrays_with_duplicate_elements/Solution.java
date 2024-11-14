package DSA.union_of_two_arrays_with_duplicate_elements;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int findUnion(int a[], int b[]) {
        Set unionSet=new HashSet<>();
        for(int i=0;i<Math.max(a.length, b.length);i++){
            if(i<a.length)
                unionSet.add(a[i]);
            if(i<b.length)
                unionSet.add(b[i]);
        }
        return unionSet.size();
    }
}