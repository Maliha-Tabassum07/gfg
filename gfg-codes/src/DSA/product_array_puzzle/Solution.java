package DSA.product_array_puzzle;

class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int product=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
                continue;
            }
            product=product*arr[i];
        }
        int res[]=new int[arr.length];
        if (count==1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    res[i]=product;
                }
                else {
                    res[i]=0;
                }
            }
        }
        else if(count>1){
            for(int i=0;i<arr.length;i++){
                res[i]=0;
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                res[i]=product/arr[i];
            }
        }
        return res;
    }
}
