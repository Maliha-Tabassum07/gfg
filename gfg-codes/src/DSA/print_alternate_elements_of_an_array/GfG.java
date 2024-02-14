package DSA.print_alternate_elements_of_an_array;

class GfG
{
    public static void print(int arr[], int n)
    {
        for(int i=0;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}