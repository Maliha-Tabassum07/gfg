package DSA.reverse_a_string;

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char[] chars = str.toCharArray();
        int length = chars.length;
        for(int i=0;i<length/2;i++){
            char temp=chars[i];
            chars[i]=chars[length-i-1];
            chars[length-i-1]=temp;
        }
        return new String(chars);
    }
}