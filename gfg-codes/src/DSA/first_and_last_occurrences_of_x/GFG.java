package DSA.first_and_last_occurrences_of_x;

import java.util.ArrayList;

class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==x && ans.isEmpty()){
                ans.add(i);
            }
            if(arr[i]>x && ans.size() == 1 ){
                ans.add(i-1);
                break;
            }
        }
        if(ans.size() == 1){
            ans.add(n-1);
        }
        else if(ans.isEmpty()){
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
}

