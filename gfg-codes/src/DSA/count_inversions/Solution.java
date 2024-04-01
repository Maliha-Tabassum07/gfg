package DSA.count_inversions;


import java.util.ArrayList;

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        return mergeSort(0l,N-1,arr);
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
        // int leftPointer = (int)low;
        // int rightPointer = (int)(mid + 1);
        // long temp[] = new long[arr.length];
        // int i = 0;
        // long count=0l;
        // while (leftPointer<=mid && rightPointer<=high){
        //     if (arr[leftPointer]<=arr[rightPointer]){
        //         temp[i]=arr[leftPointer];
        //         i++;
        //         leftPointer++;
        //     }
        //     else {
        //         temp[i]=arr[rightPointer];
        //         count+=(mid-(long)leftPointer+1);
        //         i++;
        //         rightPointer++;
        //     }
        // }
        // while (leftPointer<=mid){
        //     temp[i]=arr[leftPointer];
        //     i++;
        //     leftPointer++;
        // }
        // while (rightPointer<=high){
        //     temp[i]=arr[rightPointer];
        //     i++;
        //     rightPointer++;
        // }
        // for (int j=(int)low;j<=high;j++){
        //     arr[j]=temp[j-(int)low];
        // }
        // return count;
        ArrayList<Long> al = new ArrayList<>();

        long left = low;
        long right = mid+1;
        long count = 0 ;

        while(left<=mid && right<=high){

            if(arr[(int)left]<=arr[(int)right]){
                al.add(arr[(int)left]);
                left++;
            }
            else{
                al.add(arr[(int)right]);
                count+=(mid-left+1);
                right++;

            }

        }

        while(left<=mid){
            al.add(arr[(int)left]);
            left++;
        }

        while(right<=high){
            al.add(arr[(int)right]);
            right++;
        }

        for(int i=(int)low;i<=high;i++){
            arr[i] = al.get(i-(int)low);
        }

        return count;
    }
}
