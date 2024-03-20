package DSA.find_indexes_of_a_subarray_with_given_sum;

import java.util.ArrayList;

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // ArrayList<Integer> ans=new ArrayList<Integer>();
        // int sum= 0;
        // int start=0;
        // int end=0;
        // boolean flag=false;
        // for(int i=0;i<n;i++){
        //     if(sum==0){
        //         start=i;
        //     }
        //     sum+=arr[i];
        //     if(sum==s){
        //         end=i;
        //         flag=true;
        //         break;
        //     }
        //     if(sum>s){
        //         int j=0;
        //         int tempSum=sum;
        //         while(j!=i){
        //             if(tempSum-arr[j]==s){
        //                 start=j+1;
        //                 end=i;
        //                 ans.add(start+1);
        //                 ans.add(end+1);
        //                 return ans;
        //             }
        //             j++;
        //         }
        //         sum=0;
        //     }
        // }
        // if(flag){
        // ans.add(start+1);
        // ans.add(end+1);
        // return ans;
        // }
        // ans.add(-1);
        // return ans;

        ArrayList<Integer> ans = new ArrayList<Integer>();
        int sum = 0;
        int start = 0;
        int end = 0;
        if(s!=0){
            while (end < n) {
                sum += arr[end];
                while (sum > s) {
                    sum -= arr[start];
                    start++;
                }
                if (sum == s) {
                    ans.add(start + 1);
                    ans.add(end + 1);
                    return ans;
                }
                end++;
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    ans.add(i + 1);
                    ans.add(i + 1);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
}
