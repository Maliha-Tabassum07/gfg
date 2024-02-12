package DSA.search_in_a_matrix;

class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (mat[i][j]==X){
                    return 1;
                }
            }
        }
        return 0;
    }
}
