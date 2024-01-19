package practice.recursion;

public class FibonacchiRecursive {
    public static int fibonacchi(int n){
        if (n==0){
            return 0;
        }
        else if (n==1 || n==2){
            return 1;
        }
        else {
            return fibonacchi(n-1) +fibonacchi(n-2);
        }
    }

    public static void main(String[] args) {
        int n=6;
        for (int i=0;i<n;i++){
            System.out.print(fibonacchi(i)+" ");
        }
    }
}
