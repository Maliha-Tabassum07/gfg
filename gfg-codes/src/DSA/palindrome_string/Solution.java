package DSA.palindrome_string;


class Solution {
    int isPalindrome(String S) {
        int n=S.length();
        for(int i=0;i<n/2;i++){
            if(S.charAt(i)!=S.charAt(n-1-i)){
                return 0;
            }
        }
        return 1;
    }
}