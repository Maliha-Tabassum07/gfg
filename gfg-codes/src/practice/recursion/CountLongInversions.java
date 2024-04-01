package practice.recursion;

public class CountLongInversions {
    public static void main(String[] args) {
        long arr[]= {2, 4, 1, 3, 5};
        CountLongInversions countLongInversions=new CountLongInversions();
        System.out.println(countLongInversions.mergeSort(0,arr.length-1,arr));
    }
    public static long mergeSort(long low, long high, long arr[]){
        long count=0l;
        if(low>=high){
            return count;
        }
        long midIndex=(low+high)/2;
        count+=mergeSort(low,midIndex,arr);
        count+=mergeSort(midIndex+1,high,arr);
        count+=merge(low, high, midIndex, arr);
        return count;
    }
    public static long merge(long low, long high, long mid, long arr[]){
        int leftPointer = (int)low;
        int rightPointer = (int)(mid + 1);
        long temp[] = new long[arr.length];
        int i = 0;
        long count=0l;
        while (leftPointer<=mid && rightPointer<=high){
            if (arr[leftPointer]<=arr[rightPointer]){
                temp[i]=arr[leftPointer];
                i++;
                leftPointer++;
            }
            else {
                temp[i]=arr[rightPointer];
                count+=(mid-(long)leftPointer+1);
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
        for (int j=(int)low;j<=high;j++){
            arr[j]=temp[j-(int)low];
        }
        return count;
    }
}
