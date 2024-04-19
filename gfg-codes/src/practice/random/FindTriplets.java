package practice.random;

import java.util.Arrays;

public class FindTriplets {
    public static void main(String[] args) {
        int arr[]={6, 56, 93, -12, 26, 78, 79, 58, 53, 52, 51, 55, 77, -2, 61, -26, 91, 16, 100, -8, 72};
        System.out.println(findTriplets(arr,21));
    }
    public static boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    System.out.println("i="+i+"j="+j+"k="+k);
                    return true;
                }
                else if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
            }
        }
        return false;
    }
}
