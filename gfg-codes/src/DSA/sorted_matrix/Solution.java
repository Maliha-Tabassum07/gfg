package DSA.sorted_matrix;

import java.util.Arrays;

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        int arr[]=new int [N*N];
        int k=0;
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[k]=Mat[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        k=0;
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Mat[i][j]=arr[k];
                k++;
            }
        }
        return Mat;
    }
}
