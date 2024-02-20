package DSA.rotate_array;


class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n)
    {
        int arr2[]=new int[n];
        int count=0;
        int count2=0;
        d=d%n;
        for(int i=0;i<n;i++){
            if( (i+d)<(n))
            {
                arr2[count]=arr[i];
                arr[i]=arr[d+i];
                count++;
            }
            else {
                arr2[count]=arr[i];
                arr[i]=arr2[count2];
                count2++;
                count++;
            }
        }
    }
}
