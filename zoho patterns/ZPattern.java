import java.util.Scanner;
class ZPattern{
    public static int ZPatternMatrix(int number){
           for(int i = 2; i < number; i++){
            int boundary = (i * 2) + (i - 2);
            if(boundary == number)
            {
                return i;
            }
            if(boundary > number) break;
        }
        return -1;
    }
    public static void printZPattern(String patternString, int number){
        int tracker = 0;
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                if(i == 0 || i == number - 1){
                    System.out.print(patternString.charAt(tracker)+" ");
                    tracker++;
                }
                else if(i + j == number -1){
                    System.out.print(patternString.charAt(tracker)+" ");
                    tracker++;
                }
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String patternString = scan.next();
        int n = patternString.length();
       int matrix = ZPatternMatrix(n);
        if(matrix != -1){
            printZPattern(patternString, matrix);
        }
        else{
            System.out.print("Printing z patter for "+patternString +"is not possible");
        }
        scan.close();
    }
}