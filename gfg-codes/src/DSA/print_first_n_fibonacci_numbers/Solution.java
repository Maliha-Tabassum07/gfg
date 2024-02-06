package DSA.print_first_n_fibonacci_numbers;

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n)
    {
        long prev=1;
        long fib=1;
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            if (i==0){
                arr[i]=prev;

            }
            else if (i==1){
                arr[i]=fib;
            }
            else {
                long temp = fib + prev;
                arr[i]=temp;
                prev = fib;
                fib = temp;

            }
        }
        return arr;
    }
}
