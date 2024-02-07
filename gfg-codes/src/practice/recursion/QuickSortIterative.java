package practice.recursion;

public class QuickSortIterative {
    private void quickSort(int arr[], int lowIndex, int highIndex){
        if(lowIndex>=highIndex){
            return;
        }
        //choose pivot
        int pivot=arr[highIndex];

        //partition
        int leftPoint=lowIndex;
        int rightPoint=highIndex;
        while (leftPoint<rightPoint){
            while (arr[leftPoint]<=pivot && leftPoint<rightPoint){
                leftPoint++;
            }
            while (arr[rightPoint]>=pivot && leftPoint<rightPoint){
                rightPoint--;
            }
            //swap
            swap(arr,leftPoint,rightPoint);
        }

        swap(arr,leftPoint,highIndex);

        //recursion
        quickSort(arr,lowIndex,leftPoint-1);
        quickSort(arr,leftPoint+1,highIndex);
    }

    public void swap(int array[], int index1,int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void main(String[] args) {
        int arr[]= {24, 18, 38, 43, 14, 40, 1, 54};
        QuickSortIterative quickSortIterative=new QuickSortIterative();
        quickSortIterative.quickSort(arr,0, arr.length-1);
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
