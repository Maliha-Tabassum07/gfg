package DSA.merge_sort;


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int arrayLength=arr.length;
        if(arrayLength<2){
            return;
        }
        int leftArray[]=new int[m];
        int rightArray[]=new int[arrayLength-m];
        for(int i=0;i<m;i++){
            leftArray[i]=arr[i];
        }
        for(int i=m;i<arrayLength;i++){
            rightArray[i-m]=arr[i];
        }
        merge(leftArray,l,leftArray.length/2,r);
        merge(rightArray,l,rightArray.length/2,r);
        int i=0,j=0,k=0;
        while (i<leftArray.length && j<rightArray.length){
            if (leftArray[i]<rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }
            else {
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while (i<leftArray.length){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<rightArray.length){
            arr[k]=rightArray[j];
            j++;
            k++;
        }

    }
    void mergeSort(int arr[], int l, int r)
    {
        merge(arr,l,arr.length/2,r);
    }
}
