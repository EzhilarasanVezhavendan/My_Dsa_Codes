package Arrays;

/*Duplicate Number
Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

Example

removeDuplicates({1, 1, 2, 2, 3, 4, 5})
Output : [1, 2, 3, 4, 5]

All changes saved
|
Line 13, Column 30
Test Cases
Failed: 0, Passed: 1 of 1 tests
testExercise
Your code passed this test
Coding Exercise*/

import java.util.*;
public class DupliactionRemove{
  public static int[] removeDuplicates(int[] arr) {
 HashMap<Integer,Integer> m=new HashMap<>();
 int key=0;
 for(int i=0;i<arr.length;i++){
     if(!m.containsValue(arr[i])){
         m.put(key,arr[i]);
         key++;
     }
 }
 key=0;
 int array[]=new int[m.size()];
for(Integer k:m.keySet()){
    array[key]=m.get(k);
    key++;
}
return array;
  }
  }

