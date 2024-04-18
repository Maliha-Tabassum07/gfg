package DSA.roman_number_to_integer;


import java.util.HashMap;

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        HashMap<Character, Integer> romanNumbers = new HashMap<Character, Integer>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1) {
                if (romanNumbers.get(str.charAt(i)) < romanNumbers.get(str.charAt(i + 1))) {
                    sum -= romanNumbers.get(str.charAt(i));
                } else {
                    sum += romanNumbers.get(str.charAt(i));
                }
            } else {
                sum += romanNumbers.get(str.charAt(i));
            }
        }

        return sum;
    }
}
