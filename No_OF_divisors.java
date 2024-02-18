/*Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.



For example:
'N' = 5.
The divisors of 5 are 1, 5.*/
import java.util.ArrayList;import java.util.List;

public class No_OF_divisors{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> divisors = new ArrayList<>();
        for(int ii=1;ii<=n;ii++){
            if(n%ii==0){
            divisors.add(ii);}

        }
        return divisors;
    }
}