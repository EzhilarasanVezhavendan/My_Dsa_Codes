//"12345++++" --> 15
//"12345++*-" --> 19 which is (((1+2)+3)*4)-5
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Arithmetic_numeric {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String input = scan.next();
     StringBuffer numeric = new StringBuffer();
     StringBuffer arithmetic = new StringBuffer();
     int n = input.length();
     int value = input.charAt(0) - '0';
     if(n % 2 == 0) 
     {
         //System.out.print("Not Possible");
     }
     if(n == 0)
     {
        //System.out.print("Empty String");
     }
     if(n == 1|| n == 2)
     {
     System.out.print(input);
     }
    for(int i = 1; i < n; i++){
        char c = input.charAt(i);
        if(c >= '0' && c <= '9')
        {
            numeric.append(input.charAt(i));
        }
        else{
             arithmetic.append(input.charAt(i));
        }
       
    }
    int n1 = numeric.length();
    for(int i = 0; i < n1; i++){
        char symbol = arithmetic.charAt(i);
         int num = numeric.charAt(i) - '0';
        if(symbol == '+'){
            value += num;
        }
        else if(symbol == '-'){
            value -= num;
        }
         else if(symbol == '*'){
            value *= num;
        }
         else if(symbol == '/'){
            value /= num;
        }
    }
    //System.out.println(input);
    //System.out.println(numeric);
    // System.out.println(arithmetic);
    System.out.println(value);
    }
    
}
//close scanner 
// cher a = '8' - '0' to convert to numeric