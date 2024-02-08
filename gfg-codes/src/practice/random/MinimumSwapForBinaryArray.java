package practice.random;

public class MinimumSwapForBinaryArray {
    public static void main(String[] args) {
        int array[]={0, 1, 0, 1, 0};
        MinimumSwapForBinaryArray minimumSwapForBinaryArray=new MinimumSwapForBinaryArray();
        System.out.println(minimumSwapForBinaryArray.minimumSwap(array));
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    private int minimumSwap(int arr[]){
        int count=0;
        for (int i=arr.length-1;i>0;i--){
            if (arr[i]==0 && arr[i-1]==1){
                arr[i]=1;
                arr[i-1]=0;
                count++;
            }
            if (i!=arr.length-1 && arr[i]==1 && arr[i+1]==0){
                arr[i]=0;
                arr[i+1]=1;
                count++;
            }
        }
        return count;
    }

}
