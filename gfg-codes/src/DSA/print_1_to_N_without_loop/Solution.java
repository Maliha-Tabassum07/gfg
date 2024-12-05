package DSA.print_1_to_N_without_loop;

class Solution {

    public void printNos(int n) {
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }
}
