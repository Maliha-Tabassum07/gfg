package practice.random;

public class RotateMatrixBy180 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6},
                { 7, 8, 9} };
        RotateMatrixBy180 rotateMatrixBy180=new RotateMatrixBy180();
        PrintingMatrix printingMatrix=new PrintingMatrix();
        printingMatrix.printMatrix(rotateMatrixBy180.rotateMatrix(mat));
        int[][] mat2 = { { 1, 2, 3, 4  },
                { 5, 6, 7, 8 },
                { 9, 0, 1, 2},
                {3, 4, 5, 6 }
        };
        printingMatrix.printMatrix(rotateMatrixBy180.rotateMatrix(mat2));
    }
    private int[][] rotateMatrix(int mat[][]){
        int count=(mat.length * mat[0].length)/2;
        int count1=0;
        for(int i=0;i<=mat.length/2;i++){
           for(int j=0;j<mat[0].length;j++){
               if (count1==count){
                   break;
               }
               int temp=mat[i][j];
               mat[i][j]=mat[mat.length-i-1][mat[0].length-j-1];
               mat[mat.length-i-1][mat[0].length-j-1]=temp;
               count1++;
           }
        }
        return mat;
    }
}
