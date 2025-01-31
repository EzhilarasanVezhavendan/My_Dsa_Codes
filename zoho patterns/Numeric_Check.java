// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Numeric_Check{
    public static int pointsCalculation(int number){
        int value = 0;
        if(checkPerfect(number))
        value += 5;
        if(checkDivisible(number))
        value += 4;
        if(checkEven(number))
        value += 3;
        return value;
    }
        public static boolean checkPerfect(int number){
            for(int i = 1; i * i <= number; i++){
                if(i * i == number)
                return true;
            }
            return false;
        }
    public static boolean checkDivisible(int number){
            if(((number % 4) == 0) && ((number % 6) == 0))
            return true;
        return false;
    }
public static boolean checkEven(int number){
    if(number % 2 == 0){
    return true;
    }
    return false;
}
public static void swap(int i, int j, int arr[]){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public static void sortBasedPoints(int array[], int pointsArray[], int n){
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(pointsArray[j] > pointsArray[i]){
                    swap(i, j , pointsArray);
                    swap(i, j , array);
                }
            }
        }
}
    public static void main(String[] args) {
        int array[] ={10,36,3,49,12};
        int n = array.length;
        int pointsArray[] = new int [n];
        for(int i = 0; i < n; i++){
            pointsArray[i] = pointsCalculation(array[i]);
        }
        sortBasedPoints(array, pointsArray, n);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(pointsArray));
    }
}

// public static boolean checkDivisible(int number) {
//     return number % 12 == 0;
// }
