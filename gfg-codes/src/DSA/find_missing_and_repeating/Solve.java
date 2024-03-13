package DSA.find_missing_and_repeating;

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int ans[]=new int[2];
        int check[]=new int[n];
        for(int i=0;i<n;i++){
            check[arr[i]-1]++;
        }
        for(int i=0;i<n;i++){
            if(check[i]==0) ans[1]=i+1;
            if(check[i]==2) ans[0]=i+1;
        }
        return ans;
    }
}
