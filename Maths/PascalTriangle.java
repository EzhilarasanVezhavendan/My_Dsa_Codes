import java.util.Scanner;
public class PascalTriangle {
    public static void ncr(int n,int r){
        int nr=1;
        for(int i=0;i<r;i++){
            nr*=n-i;
            nr/=i+1;

        }
        System.out.print(nr+" ");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int n=scan.nextInt();
        for(int j=0;j<n;j++){
        for(int i=0;i<=j;i++){
            ncr(j,i);
        }
System.out.println();
    }
}
}
