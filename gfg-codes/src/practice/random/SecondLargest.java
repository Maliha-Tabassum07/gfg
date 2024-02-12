package practice.random;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        SecondLargest secondLargest=new SecondLargest();
        System.out.println(secondLargest.findSecondLargest(arr));
    }
    private int findSecondLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
                int temp=arr[0];
                arr[0]=max;
                arr[i]=temp;
            }
        }
        for (int i=1;i< arr.length;i++){
            if (arr[i]<max && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        if (secondLargest!=Integer.MIN_VALUE){
            return secondLargest;
        }
        return -1;
    }
}
