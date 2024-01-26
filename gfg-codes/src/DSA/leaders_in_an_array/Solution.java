package DSA.leaders_in_an_array;

import java.util.ArrayList;
import java.util.Collections;

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        Integer max=-1;
        ArrayList<Integer> leader= new ArrayList<Integer>();
        for (int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                leader.add(arr[i]);
            }
        }
        Collections.reverse(leader);
        return leader;

    }
}
