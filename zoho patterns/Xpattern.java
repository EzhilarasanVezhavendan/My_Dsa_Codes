// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Xpattern{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        if((n % 2) == 0){
            System.out.print("Not possible to print the pattern");
            return;
        }
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if(row == col)
                {
                    System.out.print(s.charAt(row));
                }
                else if(row + col  == (n - 1))
                {
                    System.out.print(s.charAt(col));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //scan.close();
    }
}