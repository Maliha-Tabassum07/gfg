package DSA.selection_sort;


class Solution
{
    int  select(int arr[], int i)
    {
        int min = Integer.MAX_VALUE;
        int index=0;
        for(int j=i;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
                index=j;
            }
        }
        return index;
    }

    void selectionSort(int arr[], int n)
    {
        int temp;
        int index;
        for(int i=0;i<n;i++){
            temp=arr[i];
            index=select(arr,i);
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
}
