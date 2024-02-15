package practice.random;

public class RotateMatrixBy180 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        RotateMatrixBy180 rotateMatrixBy180=new RotateMatrixBy180();
        PrintingMatrix printingMatrix=new PrintingMatrix();
        printingMatrix.printMatrix(rotateMatrixBy180.rotateMatrix(mat));
    }
    private int[][] rotateMatrix(int mat[][]){
        for(int i=0;i<=mat.length/2;i++){
           for(int j=0;j<mat[0].length;j++){
               if ( i==mat.length/2 && j> mat[0].length/2){
                   break;
               }
               int temp=mat[i][j];
               mat[i][j]=mat[mat.length-i-1][mat[0].length-j-1];
               mat[mat.length-i-1][mat[0].length-j-1]=temp;
           }
        }
        return mat;
    }
}
