package DSA.longest_common_prefix_in_an_array;

class Solution{
    String longestCommonPrefix(String arr[], int n){
        Integer minimumLength= 1000;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<minimumLength){
                minimumLength=arr[i].length();
            }
        }
        Character checker ='a';
        String prefix = null;
        for(int i=0;i<minimumLength;i++){
            for(int j=0;j<arr.length;j++){
                if(i==0 && j==0){
                    checker= arr[j].charAt(i);
                }
                else if(!checker.equals(arr[j].charAt(i))){
                    if(prefix==null){
                        return "-1";
                    }
                    return prefix;
                }
            }
            if(prefix==null){
                prefix= ""+checker;
            }
            else{
                prefix= prefix+checker;
            }

            if(i!=minimumLength-1){
                checker=arr[0].charAt(i+1);
            }

        }
        return prefix;
    }
}