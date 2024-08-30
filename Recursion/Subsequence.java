package Recursion;
import java.util.*;

public class Subsequence {

// need to print all subsets of an array
    public static void sub(int []arr,List<Integer> list,int len,int initial){
        if(initial==len){
            if(!list.isEmpty()){
                for(int y:list)
                System.out.print(y+" ");
            }
        else{
             System.out.print("{}");
        }
            System.out.println();
            return;
        }
        list.add(arr[initial]);
        sub(arr,list,len,initial+1);
        list.remove(list.size()-1);
           sub(arr,list,len,initial+1);
        
    }
    public static void main(String[] args) {
 int arr[]={3,1,2};
 List<Integer> list=new ArrayList<>();
Subsequence.sub(arr,list,3,0);
 
 
    }

}
