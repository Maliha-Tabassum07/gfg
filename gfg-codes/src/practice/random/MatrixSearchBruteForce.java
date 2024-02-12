package practice.random;

public class MatrixSearchBruteForce {
    public static void main(String[] args) {
        MatrixSearchBruteForce matrixSearchBruteForce=new MatrixSearchBruteForce();
        int x = 8;
        int[][] arr = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };
        System.out.println(matrixSearchBruteForce.searchElement(arr,128));
    }
    private boolean searchElement(int mat[][],int x){
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (mat[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }
}
