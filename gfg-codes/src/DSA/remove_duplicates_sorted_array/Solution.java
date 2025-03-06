package DSA.remove_duplicates_sorted_array;

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        int count=0;
        int left=0;
        int right=1;
        while(left<=right && right<arr.length){
            if(arr[left]==arr[right]){
                right++;
                count++;
            }
            else{
                left++;
                arr[left]=arr[right];
                right++;
            }
        }
        return arr.length-count;
    }
}

