///a1b2c3
    import java.util.Scanner;
class Stringex{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        StringBuilder answer = new StringBuilder();
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            char c = s.charAt(i);
            i++;  // Move to next character
            
            // Extract the number associated with the character
            int loop = 0;
            while (i < n && Character.isDigit(s.charAt(i))) {
                loop = loop * 10 + (s.charAt(i) - '0');
                i++;
            }

            // Append the character 'loop' times
            if (loop > 0) {
                for (int j = 0; j < loop; j++) {
                    answer.append(c);
                }
            }
        }

        System.out.print(answer);
        scan.close();
    }
}

