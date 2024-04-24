package DSA.trapping_rain_water;

class Solution{

    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) {
        int left=1;
        int right=n-2;
        long maxLeft=(long)arr[0];
        long maxRight=(long)arr[n-1];
        long rain=0;
        long rainCount=0;
        while(left<=right){
            if(maxLeft<=maxRight){
                if(maxLeft>(long)arr[left]){
                    rainCount=maxLeft-(long)arr[left];
                    rain+=rainCount;
                }
                maxLeft=Math.max((long)arr[left],maxLeft);
                left++;
            }
            else{
                if(maxRight>(long)arr[right]){
                    rainCount=maxRight-(long)arr[right];
                    rain+=rainCount;
                }
                maxRight=Math.max((long)arr[right],maxRight);
                right--;
            }
        }
        return rain;
    }
}
