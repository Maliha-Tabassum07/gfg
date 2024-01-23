package practice.recursion;

public class BinarySearchIterative {
    private int binarySearch(int arr[],int target){
        int left=0;int right= arr.length-1;
        while(left<=right){
            int middle=left+(right-left)/2;
            System.out.println(middle);
            if (arr[middle]==target){
                return middle;
            }
            if (arr[middle]<target){
                left=middle+1;
            }
            else {
                right=middle-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchIterative binarySearchIterative=new BinarySearchIterative();
        int arr[]={ 2, 3, 4, 10, 40 };
        int result=binarySearchIterative.binarySearch(arr,40);
        if (result!=-1){
            System.out.println("In index "+result);
        }
        else {
            System.out.println("Not available");
        }
    }
}
