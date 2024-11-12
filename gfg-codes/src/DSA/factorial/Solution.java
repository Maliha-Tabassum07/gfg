package DSA.factorial;

class Solution{
    static long factorial(int N){
        int prod=1;
        for(int i=N;i>1;i--){
            prod*=i;
        }
        return prod;
    }
}