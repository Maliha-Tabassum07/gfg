package DSA.anagram;

import java.util.Arrays;

class Solution
{
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        //     HashMap<Integer, Character> frequencyMap=new HashMap<>();
        //     if(a.length()!=b.length()){
        //         return false;
        //     }
        //     for(int i=0;i<a.length();i++){
        //         if(!b.contains(String.valueOf(a.charAt(i)))){
        //             return false;
        //         }

        //         for (int j=0;j<b.length();j++){
        //         if(b.charAt(j)==a.charAt(i) && !frequencyMap.containsKey(j)){
        //                 frequencyMap.put(j,b.charAt(j));
        //                 break;
        //             }
        //         }
        //     }
        //     return (frequencyMap.size()==a.length());
        // }
        if (a.length() != b.length()) {
            return false;
        }

        int[] frequencyA = new int[26];
        int[] frequencyB = new int[26];

        for (char ch : a.toCharArray()) {
            frequencyA[ch - 'a']++;
        }

        for (char ch : b.toCharArray()) {
            frequencyB[ch - 'a']++;
        }

        return Arrays.equals(frequencyA, frequencyB);
    }
}
