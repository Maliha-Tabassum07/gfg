package practice.random;

public class CyclicallyRotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr_size = arr.length;
        CyclicallyRotateArray cyclicallyRotateArray=new CyclicallyRotateArray();
        cyclicallyRotateArray.rotate(arr,arr_size);
        for (int i=0;i<arr_size;i++){
            System.out.print(arr[i]);
        }
    }
    public void rotate(int arr[], int n)
    {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}
