package DSA.binary_array_sorting;


class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        int count0=0;
        for(int i=0;i<N;i++){
            if(A[i]==0){
                count0++;
            }
        }
        for(int i=0;i<N;i++){
            if(i<count0){
                A[i]=0;
            }
            else{
                A[i]=1;
            }
        }

        /**************
         * No need to print the array
         * ************/
    }
}
