package DSA.rotate_by_90_degree;

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n)
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-i][j];
                matrix[n-1-i][j]=temp;
            }
        }
    }
}
