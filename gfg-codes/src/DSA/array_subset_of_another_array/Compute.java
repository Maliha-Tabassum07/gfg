package DSA.array_subset_of_another_array;


import java.util.HashMap;
import java.util.Map;

//User function Template for Java
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Map<Long, Integer> checker = new HashMap<>();
        for (long count : a1) {
            checker.put(count, checker.getOrDefault(count, 0) + 1);
        }
        for (long count : a2) {
            if (checker.containsKey(count) && checker.get(count) > 0) {
                checker.put(count, checker.get(count) - 1);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
