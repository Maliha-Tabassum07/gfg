package practice.recursion;
public class MergeSortIterative {
    private void sort(int arr[],int arrayLength){
     if(arrayLength<2){
         return;
     }
     int midIndex=arrayLength/2;
     int leftArray[]=new int[midIndex];
     int rightArray[]=new int[arrayLength-midIndex];
     for(int i=0;i<midIndex;i++){
         leftArray[i]=arr[i];
     }
     for(int i=midIndex;i<arrayLength;i++){
         rightArray[i-midIndex]=arr[i];
     }
     sort(leftArray,leftArray.length);
     sort(rightArray,rightArray.length);
     merge(arr,leftArray,rightArray);
    }
    private void merge(int arr[],int leftArray[],int rightArray[]){
        int i=0,j=0,k=0;
        while (i<leftArray.length && j<rightArray.length){
            if (leftArray[i]<=rightArray[j]){
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
    public static void main(String[] args) {
        int arr[]= {4, 1, 3, 9, 8};
        MergeSortIterative mergeSortIterative=new MergeSortIterative();
        mergeSortIterative.sort(arr,arr.length);
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
