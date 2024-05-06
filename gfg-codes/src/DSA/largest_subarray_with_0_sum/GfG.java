package DSA.largest_subarray_with_0_sum;

import java.util.HashMap;

class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> sumMap=new HashMap<Integer, Integer>();
        int maxLength=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxLength=i+1;
            }
            else{
                if (sumMap.containsKey(sum)){
                    maxLength=Math.max(i-sumMap.get(sum),maxLength);
                }
                else{
                    sumMap.put(sum,i);
                }
            }
        }
        return maxLength;
    }
}