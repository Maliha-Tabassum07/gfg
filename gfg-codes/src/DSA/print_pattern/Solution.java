package DSA.print_pattern;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> pattern(int N) {
        List<Integer> result=new ArrayList<>();
        printPattern(N,result);
        return result;
    }
    public void printPattern(int N, List<Integer> result){
        result.add(N);
        if(N>0){
            printPattern(N-5,result);
            result.add(N);
        }
    }
}
