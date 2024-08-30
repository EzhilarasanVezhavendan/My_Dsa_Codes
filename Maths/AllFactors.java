import java.util.*;

public class AllFactors {
public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        int val=scan.nextInt(),count=0;
        for(int i=1;val>=i*i;i++){
            if(val%i==0){
                if(i==val/i) {
                    System.out.print(i+" ");
                    return;
                 
                }
                else     System.out.print(i+" "+val/i+" ");
            }
        }
        System.out.println(count);
}
    
}
