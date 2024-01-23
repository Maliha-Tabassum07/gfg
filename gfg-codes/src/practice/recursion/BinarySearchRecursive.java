package practice.recursion;

public class BinarySearchRecursive {
    private int binarySearchRecursive(int arr[],int target,int left,int right){
        if(left<=right){
            int middle=left+(right-left)/2;
            System.out.println(middle);
            if (arr[middle]==target){
                return middle;
            }
            if (arr[middle]<target){
                return binarySearchRecursive(arr,target,middle+1,right);
            }
            else {
                return binarySearchRecursive(arr,target,left,middle-1);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearchRecursive binarySearch=new BinarySearchRecursive();
        int arr[]={ 2, 3, 4, 10, 40 };
        int result=binarySearch.binarySearchRecursive(arr,40,0,arr.length-1);
        if (result!=-1){
            System.out.println("In index "+result);
        }
        else {
            System.out.println("Not available");
        }
    }
}
