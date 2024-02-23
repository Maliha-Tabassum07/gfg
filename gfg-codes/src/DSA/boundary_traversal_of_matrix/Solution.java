package DSA.boundary_traversal_of_matrix;

import java.util.ArrayList;

class Solution
{
    //Function to return list of integers that form the boundary
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> boundaryIndex=new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i==0 ){
            if(j<m){
                boundaryIndex.add(matrix[i][j]);
                j++;
            }
            else{
                i++;
                j--;
            }
        }
        if(n<=1){
            return boundaryIndex;
        }
        while(j==m-1 ){
            if(i<n){
                boundaryIndex.add(matrix[i][j]);
                i++;
            }
            else{
                i--;
                j--;
            }
        }
        if(m<=1){
            return boundaryIndex;
        }
        while(i==n-1){
            if(j>=0){
                boundaryIndex.add(matrix[i][j]);
                j--;
            }
            else{
                j++;
                i--;
            }
        }
        while(i>0){
            boundaryIndex.add(matrix[i][j]);
            i--;
        }
        return boundaryIndex;
    }
}
