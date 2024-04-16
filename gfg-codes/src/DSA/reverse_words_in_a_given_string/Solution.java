package DSA.reverse_words_in_a_given_string;

import java.util.StringJoiner;

class Solution
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] words = S.split("\\.");
        for(int i=0;i<words.length/2;i++){
            String temp=words[i];
            words[i]=words[words.length-1-i];
            words[words.length-1-i]=temp;
        }
        StringJoiner joiner = new StringJoiner(".");
        for(String word:words){
            joiner.add(word);
        }
        return joiner.toString();
    }
}
