package DSA.power_of_2;

class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(int n) {
        if(n==1)
            return true;
        while(n>=2){
            if(n%2!=0)
                return false;
            n=n/2;
        }
        return true;
    }
}
