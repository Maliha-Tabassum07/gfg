package DSA.insertion_sort;

class Solution
{
    public static void insert(int arr[],int i)
    {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && key < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }

    public static void insertionSort(int arr[],int n)
    {
        for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
    }
}
