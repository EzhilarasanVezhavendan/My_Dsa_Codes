import java.util.ArrayList;
import java.util.Stack;

class NGE {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            if(stack.isEmpty())
            {ans[i] = -1;
            stack.push(arr[i]);
            continue;
            }
            while( !stack.isEmpty() && arr[i] >= stack.peek() )
            stack.pop();
    
                if (!stack.isEmpty()) {
                ans[i] = stack.peek();
            } else {
                ans[i] = -1; 
            }
                    
            stack.push(arr[i]);
        }
        ArrayList<Integer> answer = new ArrayList<>();
        int length = ans.length;
        for(int i = 0; i < length; i++)
        answer.add(ans[i]);
        return answer;
    }
}
/*
 * Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]
Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn’t exist, it is -1.


Input: arr[] = [6, 8, 0, 1, 3]
Output: [8, -1, 1, 3, -1]
Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there is no larger element on right and hence -1.


Input: arr[] = [10, 20, 30, 50]
Output: [20, 30, 50, -1]
Explanation: For a sorted array, the next element is next greater element also exxept for the last element.


Input: arr[] = [50, 40, 30, 10]
Output: [-1, -1, -1, -1]
Explanation: There is no greater element for any of the elements in the array, so all are -1.


 */