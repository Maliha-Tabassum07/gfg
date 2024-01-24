package practice.recursion;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int arr[]={9,2,8,4,5,6,9};
        InsertionSortRecursion insertionSortObject=new InsertionSortRecursion();
        int i=1;
        insertionSortObject.insertionSort(arr,i, arr[i],i-1);
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
    public int[] insertionSort(int[] arr,int i, int key,int j){
        if (i==arr.length-1){
            return arr;
        }
        if(j>=0 && key<arr[j]){
            arr[j+1]=arr[j];
            return insertionSort(arr,i,key,--j);
        }

        else {
            arr[j+1]=key;
            i++;
            return insertionSort(arr,i,arr[i],i-1);
        }
    }
}
