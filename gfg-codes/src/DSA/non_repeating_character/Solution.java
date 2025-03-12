package DSA.non_repeating_character;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        Map<Character, Integer> frequency=new HashMap<>();
        for(Character c:s.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c, 0)+1);
        }
        if(frequency.containsValue(1)){
            for(Character c:s.toCharArray()){
                if(frequency.get(c).equals(1)){
                    return c;
                }
            }
        }
        return '$';
    }
}