package DSA.count_digits;

class Solution {
    static int evenlyDivides(int n) {
        int rem=n%10;
        int div=n/10;
        int count=0;

        while(rem>=1 || div!=0){
            if(rem!=0){
                if(n%rem==0){
                    count++;
                }
            }

            rem=div%10;
            div=div/10;
        }
        return count;
    }
}
