package DSA.common_elements;


import java.util.ArrayList;

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        ArrayList<Integer> common= new ArrayList<Integer>();
        for (int i=0;i<n1;i++){
            int left=0;int right= n2-1;
            while(left<=right){
                int middle=left+(right-left)/2;
                if (B[middle]==A[i]){
                    int left1=0;int right1= n3-1;
                    while(left1<=right1){
                        int middle1=left1+(right1-left1)/2;
                        if (C[middle1]==A[i]&&!common.contains(A[i])){
                            common.add(A[i]);
                            break;
                        }
                        if (C[middle1]<A[i]){
                            left1=middle1+1;
                        }
                        else {
                            right1=middle1-1;
                        }

                    }
                }
                if (B[middle]<A[i]){
                    left=middle+1;
                }
                else {
                    right=middle-1;
                }

            }
        }
        return common;
    }
}
