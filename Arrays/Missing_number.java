package Arrays;
public class Missing_number {

    static int findMissingNumberInArray(int[] arr) {
        int count = 0;
        for (int a : arr) {
            count += a;
            
        }
        
        int ab=arr.length+1;
        int num = (ab* (ab+1)) / 2;
        
return num-count;
        
    }

}
