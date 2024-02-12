package practice.random;

public class PrintDiagonal {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        PrintDiagonal printDiagonal=new PrintDiagonal();
        printDiagonal.printDiagonal(a);
    }
    private void printDiagonal(int mat[][]){
        System.out.println("Primary diagonal");
        for (int i=0;i<mat.length;i++){
            System.out.print(mat[i][i]+ " ");
        }
        System.out.println();
        System.out.println("Secondary diagonal ");
        for (int i=0;i<mat.length;i++){
            System.out.print(mat[i][mat.length-i-1]+ " ");
        }
    }
}
