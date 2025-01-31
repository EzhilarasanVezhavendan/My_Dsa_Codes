import java.util.*;
class Spiral_Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int left = 0;
        int right = x - 1;
        int top = 0, bottom = x - 1;
        int num = x;
        int arr[][]= new int [x][x];
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                arr[top][i] = num;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                arr[i][right] = num;    
            }
            right--;
        if(top <= bottom){
            for(int i = right; i >= left; i--){
                arr[bottom][i] = num;
            }
            bottom--;
        
        }
        if(left <= right){
            for(int i = bottom; i >= top; i--){
                arr[i][left] = num;
            }
            left++;
        }
            num--;
        }
        sc.close();
       for(int i =0;i < x;i++){
        for(int j =0; j < x; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }

    }
}