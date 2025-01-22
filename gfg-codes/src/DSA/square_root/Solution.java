package DSA.square_root;

class Solution {
    int floorSqrt(int n) {
        if(n<=0) return 0;
        if(n==1) return n;
        int low=1;
        int high=n;
        int result=1;
        while(high>=low){
            int mid=(high+low)/2;
            if((mid*mid)==n){
                return mid;
            }
            else if((mid*mid)<n){
                low=mid+1;
                result = mid;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
}
