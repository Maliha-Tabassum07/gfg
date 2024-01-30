package practice.random;

public class EquilibriumPointNaiveApproach {
    private int equilibriumPoint(int arr[], int n){
        int leftSum, rightSum;
        for(int i=0;i<n;i++){
            leftSum=0;
            rightSum=0;
            for(int j=0;j<i;j++){
                leftSum+=arr[j];
            }
            for(int j=i+1;j<n;j++){
                rightSum+=arr[j];
            }
            if (leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        {
            EquilibriumPointNaiveApproach equilibrium = new EquilibriumPointNaiveApproach();
            int arr[] = { -7, 1, 5, 2, -4, 3};
            int arr_size = arr.length;

            // Function call
            System.out.println(equilibrium.equilibriumPoint(arr, arr_size));
        }
    }
}
