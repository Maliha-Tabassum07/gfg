package practice.recursion;

public class CountInversion {
    public static void main(String[] args) {
        int arr[]= {2, 4, 1, 3, 5};
        CountInversion mergeSortRecursive=new CountInversion();
        System.out.println(mergeSortRecursive.mergeSort(0,arr.length-1,arr));
    }
    public static int mergeSort(int low, int high, int arr[]){
        int count=0;
        if(low>=high){
            return count;
        }
        int midIndex=(low+high)/2;
        count+=mergeSort(low,midIndex,arr);
        count+=mergeSort(midIndex+1,high,arr);
        count+=merge(low, high, midIndex, arr);
        return count;
    }
    public static int merge(int low, int high, int mid, int arr[]){
        int leftPointer=low;
        int rightPointer=mid+1;
        int temp[]=new int[arr.length];
        int i=0;
        int count=0;
        while (leftPointer<=mid && rightPointer<=high){
            if (arr[leftPointer]<=arr[rightPointer]){
                temp[i]=arr[leftPointer];
                i++;
                leftPointer++;
            }
            else {
                temp[i]=arr[rightPointer];
                count+=(mid-leftPointer+1);
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
        return count;
    }
}
