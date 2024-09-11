package maths;
import java.util.ArrayList;

public class SubsetsOfArray{
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();
      v.add(1);
        v.add(2);
          v.add(3);
        int n = v.size();  // Step 1: Get the number of elements in the set
        int subsetCount = (int) Math.pow(2, n);  // Step 2: Calculate total subsets (2^n)
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(subsetCount);  // Step 3: Initialize result list

        for (int i = 0; i < subsetCount; i++) {  // Step 4: Loop over each number from 0 to 2^n - 1
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j = i, k = 0; j > 0; j>>=1, k++) {  // Step 5: Loop to determine the subset
                if ((j&1)== 1) {  // Step 6: Check if the k-th element should be included
                    subset.add(v.get(k));  // Step 7: Add element v[k] to the current subset
                }
            }
            ans.add(subset);  // Step 8: Add the generated subset to the result list
        }

       for(ArrayList<Integer> a:ans)
       System.out.println(a);
    }
}
