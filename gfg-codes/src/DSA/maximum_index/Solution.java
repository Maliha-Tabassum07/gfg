package DSA.maximum_index;


class Solution{

    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) {

        // Optimized brute force
        // for(int i=0;i<n;i++){
        //     for(int j=n-1;j>i;j--){
        //         if(a[i]<=a[j] ){
        //             if((j-i)>=difference){
        //                 difference=j-i;
        //             }
        //             break;
        //         }
        //     }
        // }
        int difference=0;
        int maxRight[]=new int[n];
        maxRight[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i]=Math.max(maxRight[i+1],a[i]);
        }
        int left =0;
        int right =0;
        while(left<n && right<n){
            if(a[left]<=maxRight[right]){
                difference=Math.max(difference,right-left);
                right++;
            }
            else{
                left++;
            }
            if (left > right) {
                right = left;
            }
        }
        return difference;

    }
}