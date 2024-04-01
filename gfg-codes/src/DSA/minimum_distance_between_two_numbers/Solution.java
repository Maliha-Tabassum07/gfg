package DSA.minimum_distance_between_two_numbers;

class Solution {
    int minDist(int a[], int n, int x, int y) {
        int min=Integer.MAX_VALUE;
        int prev=0;
        for(int i=0;i<n;i++){
            // for(int j=0;j<n;j++){
            //     if(((a[i]==x && a[j]==y)||(a[j]==x && a[i]==y))&& min>Math.abs(i-j)){
            //         min=Math.abs(i-j);
            //     }
            // }
            if(a[i]==x||a[i]==y){
                prev=i;
                break;
            }
        }
        for(int i=prev;i<n;i++){
            if(a[i]==x||a[i]==y){
                if((a[i]!=a[prev]) && min>(i-prev)){
                    min=i-prev;
                    prev=i;
                }
                else{
                    prev=i;
                }
            }
        }
        if(min<Integer.MAX_VALUE){
            return min;
        }
        return -1;
    }
}
