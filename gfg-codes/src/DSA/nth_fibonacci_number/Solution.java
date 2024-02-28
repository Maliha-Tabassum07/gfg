package DSA.nth_fibonacci_number;


class Solution {
    static int nthFibonacci(int n){
        int prev=0;
        int fib=1;
        if (n == 0) return prev;
        if (n == 1) return fib;
        for(int i=0;i<n;i++){
            int sum = (fib + prev) % 1000000007;
            prev = fib;
            fib = sum;
        }
        return prev;
    }
}
