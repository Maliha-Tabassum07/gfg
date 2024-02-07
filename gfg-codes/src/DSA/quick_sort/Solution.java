package DSA.quick_sort;

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low>=high){
            return;
        }
        int leftIndex=partition(arr,low,high);
        quickSort(arr,low,leftIndex-1);
        quickSort(arr,leftIndex+1,high);

    }
    static int partition(int arr[], int low, int high)
    {
        //choose pivot
        int pivot=arr[high];
        //partition
        int leftPoint=low;
        int rightPoint=high;
        while (leftPoint<rightPoint){
            while (arr[leftPoint]<=pivot && leftPoint<rightPoint){
                leftPoint++;
            }
            while (arr[rightPoint]>=pivot && leftPoint<rightPoint){
                rightPoint--;
            }
            //swap
            swap(arr,leftPoint,rightPoint);
        }
        swap(arr,leftPoint,high);
        return leftPoint;
    }

    static void swap(int array[], int index1,int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}

