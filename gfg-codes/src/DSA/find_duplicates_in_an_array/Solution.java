package DSA.find_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashSet<Integer> items = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (items.contains(arr[i])) {
                duplicateSet.add(arr[i]);
            } else {
                items.add(arr[i]);
            }
        }
        ArrayList<Integer> duplicates = new ArrayList<>(duplicateSet);
        if (duplicates.isEmpty()) {
            duplicates.add(-1);
        } else {
            Collections.sort(duplicates);
        }
        return duplicates;
    }
}
