package DSA.second_largest;

class Solution {
    int print2largest(int arr[], int n) {
        // Arrays.sort(arr);
        // int largest = arr[arr.length-1];
        // for (int i=arr.length-2;i>=0;i--){
        //     if(arr[i]<largest){
        //         return arr[i];
        //     }
        // }
        // return -1;
        int max=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                int temp=arr[0];
                arr[0]=max;
                arr[i]=temp;
            }
        }
        for (int i=1;i< arr.length;i++){
            if (arr[i]<max && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        if (secondLargest!=Integer.MIN_VALUE){
            return secondLargest;
        }
        return -1;
    }
}
