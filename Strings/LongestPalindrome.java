import java.util.Scanner;
class LongestPalindrome{
    public static String k(String g){
        int start=0,len=1;
        for(int i=1;i<g.length();i++){
            
            int c1=i-1,c2=i;
            //even
            //(l >= 0 && r < S.length() && S.charAt(l) == S.charAt(r)
            while(c1>=0 && c2<g.length() && g.charAt(c1)==g.charAt(c2)){
                if((c2-c1)+1>len){
                    len=c2-c1+1;
                    start=c1;
                }
                c1--;c2++;
            }
            //odd
            c1=i-1;c2=i+1;
            //even
            while(c1>=0&& c2<g.length() && g.charAt(c1)==g.charAt(c2)){
                if((c2-c1)+1>len){
                    len=c2-c1+1;
                    start=c1;
                }
                c1--;c2++;
            }
        }
        return g.substring(start, start + len);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String g=scan.nextLine();
        System.out.println(k(g));
    }
}