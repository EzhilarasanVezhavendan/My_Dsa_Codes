package maths;


public class  Sieve_Eratosthenes_Prime {
    public static void prime(int y){
        boolean arr[]=new boolean[y+1];
        for(int i=0;i<arr.length;i++) arr[i]=true;
        for(int i=2;i*i<=y;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=y;j+=i) arr[j]=false;
            }

        }
        for(int i=2;i<=y;i++){
            if(arr[i]==true) System.err.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Sieve_Eratosthenes_Prime.prime(10);
        
    }
    
}