package maths;
import java.util.Scanner;

public class Exponential {
    public static double exp(double n,int x){
        if(n==1 || n==0) return n;
        double ans=1;
            if(x<0){
                n=1/n;
                ans*=n;
                x=-(x+1);

            }
            while (x>0) {
                if(x%2==1){
                    ans*=n;
                    x-=1;
                }
                else{
                    n*=n;
                    x/=2;
                }
            }
            return ans;
    }
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        Double a=scan.nextDouble();
        int b=scan.nextInt();
       System.out.println( Exponential.exp(a, b));

    }
    
}
