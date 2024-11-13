package DSA.sum_of_series;

class Solution {
    public static long seriesSum(int n) {
        long sum=0;
        for(long i =1l;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
