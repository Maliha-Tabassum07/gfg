package practice.recursion;

public class SelectionSortRecursive {
    private int findMin(int[] arr,int i,int min,int minIndex){
        if (i==arr.length){
            return minIndex;
        }
        if (arr[i]<min){
            min=arr[i];
            minIndex=i;
        }
        return findMin(arr,i+1,min,minIndex);

    }
    private int[] selectionSort(int[] arr,int i){
        if (i==arr.length){
            return arr;
        }
        int minIndex=findMin(arr,i, Integer.MAX_VALUE, i);
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
        return selectionSort(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={9,2,8,4,5,6,9,1,8,7667,78,3};
        SelectionSortRecursive selectionSortRecursive=new SelectionSortRecursive();
        arr = selectionSortRecursive.selectionSort(arr,0);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
