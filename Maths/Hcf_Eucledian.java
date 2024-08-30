package Maths;
import java.util.Scanner;
public class Hcf_Eucledian {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        while (a>0 && b>0) {
            if(a>b) a=(a%b);
            else b=b%a;
            
        }
        if(a==0) System.out.println(b);
        else System.out.println(a);
    }
}


/*  using eucledian theorm to print the hcf values 
 * if(a,b) then a>b means gcd(a-b,b)
 * runs until a or b becomes zero
 * here for time complexity we had been used modolus 
 * the time complexity will be around 0(log(min,max))
 */