package DSA.sort_an_array_of_0s_1s_and_2s;

import java.util.StringJoiner;
import java.util.StringTokenizer;

class Solution
{
    public static void sort012(int a[], int n)
    {
        int count0=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }
        }
        count1=count0+count1;
        for(int i=0;i<n;i++){
            if(i<count0){
                a[i]=0;
            }
            else if(i<count1){
                a[i]=1;
            }
            else{
                a[i]=2;
            }
        }
    }
}
