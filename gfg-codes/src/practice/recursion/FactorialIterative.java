package practice.recursion;

public class FactorialIterative {
    public static int factorial(int n){
        int product=1;
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
