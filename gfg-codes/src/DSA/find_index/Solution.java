package DSA.find_index;

class Solution
{
    // Function to find starting and end index
    static int[] findIndex(int arr[], int n, int key)
    {
        int index[]={-1,-1};
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                index[0]=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==key){
                index[1]=i;
                break;
            }
        }
        return index;
    }
}
