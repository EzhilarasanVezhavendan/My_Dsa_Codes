
    import java.util.Scanner;
// we need to form a larger number from the array 9786654180 tis number from the {4, 18, 78, 6, 9, 65, 0}; array
// also we can use string and inuilt methods for better optimizrtions but this is for zoho specific
    public class LargeArrayNumber {
    // Function to concatenate two numbers
    public static int combineNumbers(int num1, int num2) {
        int temp = num2;
        int digits = 1;

        while (temp > 0) {
            digits *= 10;  
            temp /= 10;
        }

        return num1 * digits + num2;  // Proper concatenation
    }

    // Swap function
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Sorting function using Bubble Sort
    public static void orderSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - 1 - i; j++) {  // Optimized loop
                int xy = combineNumbers(arr[j], arr[j + 1]);
                int yx = combineNumbers(arr[j + 1], arr[j]);

                if (yx > xy) {
                    swap(arr, j, j + 1);
                    isSwap = true;
                }
            }
            if (!isSwap) break;  // Exit early if already sorted
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 18, 78, 6, 9, 65, 0};
        int n = arr.length;
        orderSort(arr, n);

        // Print the final result as a single number
        for (int i : arr)
            System.out.print(i);
    }
}


