package practice.random;

public class EquilibriumPointArraySum {
    private int equilibriumPoint(int arr[], int n){
        int sum=0;
        int leftSum=0;
        for (int i=0;i<n;i++){
           sum+=arr[i];
        }
        for (int i=0;i<n;i++){
            sum-=arr[i];
            if(sum==leftSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        {
            EquilibriumPointArraySum equilibrium = new EquilibriumPointArraySum();
            int arr[] = { -7, 1, 5, 2, -4, 3};
            int arr_size = arr.length;

            // Function call
            System.out.println(equilibrium.equilibriumPoint(arr, arr_size));
        }
    }
}
