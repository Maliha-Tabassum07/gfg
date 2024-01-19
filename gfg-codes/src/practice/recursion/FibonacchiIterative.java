package practice.recursion;

import java.sql.SQLOutput;

public class FibonacchiIterative {
    public static void fibonacchiIterative(int n){
        int prev=0;
        int fib=1;
        for(int i=0;i<n;i++){
            if (i==0){
                System.out.print(prev+" ");

            }
            else if (i==1){
                System.out.print(fib+" ");
            }
            else {
                int temp = fib + prev;
                System.out.print(temp + " ");
                prev = fib;
                fib = temp;

            }
        }

    }

    public static void main(String[] args) {
        fibonacchiIterative(6);
    }
}
