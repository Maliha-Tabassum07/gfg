package practice.recursion;


public class MergeSortRecursive {
    public static void main(String[] args) {
        int arr[]= {4, 1, 3, 9, 8};
        MergeSortRecursive mergeSortRecursive=new MergeSortRecursive();
        mergeSortRecursive.mergeSort(0,arr.length-1,arr);
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void mergeSort(int low, int high, int arr[]){
        if(low>=high){
            return;
        }
        int midIndex=(low+high)/2;
        System.out.println("left: low:"+ low +"high: "+midIndex );
        mergeSort(low,midIndex,arr);
        System.out.println("right low:"+ (midIndex+1) +"high: "+high );
        mergeSort(midIndex+1,high,arr);
        System.out.println("merge low:"+ low +"high: "+high +"midIndex: "+ midIndex );
        merge(low, high, midIndex, arr);
    }
    public static void merge(int low, int high, int mid, int arr[]){
        int leftPointer=low;
        int rightPointer=mid+1;
        int temp[]=new int[arr.length];
        int i=0;
        while (leftPointer<=mid && rightPointer<=high){
            if (arr[leftPointer]<arr[rightPointer]){
                temp[i]=arr[leftPointer];
                i++;
                leftPointer++;
            }
            else {
                temp[i]=arr[rightPointer];
                i++;
                rightPointer++;
            }
        }
        while (leftPointer<=mid){
            temp[i]=arr[leftPointer];
            i++;
            leftPointer++;
        }
        while (rightPointer<=high){
            temp[i]=arr[rightPointer];
            i++;
            rightPointer++;
        }
        for (int j=low;j<=high;j++){
            arr[j]=temp[j-low];
        }
    }
}
