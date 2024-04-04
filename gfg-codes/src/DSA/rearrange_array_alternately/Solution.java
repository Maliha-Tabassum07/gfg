package DSA.rearrange_array_alternately;

class Solution{

    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){

        long temp[]=new long[n];
        int leftPointer=0;
        int rightPointer=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                temp[i]=arr[rightPointer];
                rightPointer--;
            }
            else{
                temp[i]=arr[leftPointer];
                leftPointer++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, n);

    }

}
