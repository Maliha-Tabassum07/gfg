package practice.recursion;

public class InsertionSort {
    private void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key =arr[i];
            int j= i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int arr[]={9,2,8,4,5,6,9};
        InsertionSort insertionSortObject=new InsertionSort();
        insertionSortObject.insertionSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
