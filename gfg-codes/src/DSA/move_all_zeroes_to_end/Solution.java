package DSA.move_all_zeroes_to_end;

class Solution {
    void pushZerosToEnd(int[] arr) {
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(pos!=i){
                    arr[pos]=arr[i];
                    arr[i]=0;
                }
                pos++;
            }
        }
    }
}
