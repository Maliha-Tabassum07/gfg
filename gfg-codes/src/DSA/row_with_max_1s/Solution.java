package DSA.row_with_max_1s;

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int rowArray[]=new int[n];
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            rowArray[i]=count;
        }
        count=-1;
        for(int i=0;i<n;i++){
            if(rowArray[i]>max){
                max=rowArray[i];
                count=i;
            }
        }
        return count;
    }
}
