package DSA.find_minimum_and_maximum_element_in_an_array;

import javafx.util.Pair;

class Compute
{
    static Pair getMinMax(long a[], long n)
    {
        Long max= -1l;
        Long min= Math.round(Math.pow(10,12)+1);

        for (int i=0;i <n;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        return new Pair(min,max);
    }
}
