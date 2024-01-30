package practice.random;

public class MajorityElementSorted {
    static boolean isMajority(int arr[], int n, int x)
    {
        int count= 0;
        for (int i =0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
            else if(arr[i]>x && count<=n/2){
                return false;
            }
        }
        return count>n/2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 3, 4};
        int n = arr.length;
        int x = 3;
        if (isMajority(arr, n, x))
            System.out.println(x+" appears more than "+
                    n/2+" times in arr[]");
        else
            System.out.println(x+" does not appear more than "+
                    n/2+" times in arr[]");
    }
}
