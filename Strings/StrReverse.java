//Reverse a String
public class StrReverse {
    public static String rev(String r){
        String arr[]=r.split(" ");
        StringBuilder b=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            b.append(arr[i]);
            if(i!=0){
                b.append(" ");
            }
           

        }
        return b.toString();
    }
    public static void main(String[] args) {
        String g="how are you";
        System.out.println(StrReverse.rev(g));
    }
}
