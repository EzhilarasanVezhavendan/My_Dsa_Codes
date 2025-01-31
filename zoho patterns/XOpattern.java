import java.util.*;
class XOpattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int m = sc.nextInt();
        int left = 0;
        int right = x - 1;
        int top = 0, bottom = x - 1;
        char c = 'x';
       char arr[][]= new char [x][m];
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                arr[top][i] =c;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                arr[i][right] =c;    
            }
            right--;
        if(top <= bottom){
            for(int i = right; i >= left; i--){
                arr[bottom][i] =c;
            }
            bottom--;
        
        }
        if(left <= right){
            for(int i = bottom; i >= top; i--){
                arr[i][left] =c;
            }
            left++;
        }
            if(c == 'x') c='o';
            else c= 'x';
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

