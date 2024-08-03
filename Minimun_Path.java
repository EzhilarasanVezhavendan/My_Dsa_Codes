
import java.util.Scanner;

public class Minimun_Path{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int comparator,sum=0;
        int[][] arr = new int[5][];

        arr[0] = new int[1];  
        arr[1] = new int[2];  
        arr[2] = new int[3];  
        arr[3] = new int[4];  
        arr[4] = new int[5];

      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }

    
        for (int i = 0; i < arr.length; i++) {
        	comparator=arr[i][0];
            for(int klr=5-i;klr>=1;klr--) {
            	System.out.print("-");
            }
            for (int j = 0; j < arr[i].length; j++) {
            	int h=arr[i].length-1;
            	
            	if(comparator > arr[i][j]) {
            		comparator=arr[i][j];
            	}
            	if(j==arr[i].length-1) {
            		sum+=comparator;
            	}
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
        System.out.println(sum);
    }

}