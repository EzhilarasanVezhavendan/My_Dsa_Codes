package Maths;
import java.util.Scanner;

public class TotalPrimeFactors {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    n/=i;
                }
                System.out.println(i);
            }

        }
    }

    
}
