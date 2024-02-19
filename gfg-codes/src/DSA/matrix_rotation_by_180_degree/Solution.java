package DSA.matrix_rotation_by_180_degree;

class Solution
{
    public void  rotate(int[][] matrix)
    {
        int count=(matrix.length * matrix[0].length)/2;
        int count1=0;
        for(int i=0;i<=matrix.length/2;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (count1==count){
                    break;
                }
                int temp=matrix[i][j];
                matrix[i][j]=matrix[matrix.length-i-1][matrix[0].length-j-1];
                matrix[matrix.length-i-1][matrix[0].length-j-1]=temp;
                count1++;
            }
        }
    }
}
