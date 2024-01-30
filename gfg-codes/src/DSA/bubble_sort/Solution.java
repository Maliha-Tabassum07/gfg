package DSA.bubble_sort;

class Solution
{
    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
