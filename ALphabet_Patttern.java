
public class ALphabet_Patttern {

    public static void main(String[] args) {

        byte row, col, lgg = 15, inc = 1, l15 = 18;
        short alpha = 'A';
        alpha -= 1;
        
        // String str2 = Integer.toString(b);
        for (col = 1; col <= 5; col++) {
            for (row = 1; row <= 5; row++) {
                if (col >= 2 && row == 1) {
                    System.out.print((char)(alpha+l15 - col) + " ");// sc
                }
                if (col == 1) {
                    System.out.print((char) (alpha + row) + " ");// sc
                }
                if (col > 1 && row == 5) {
                    System.out.print((char) ((alpha + col + row) - 1) + " ");
                }
                if (col == 2 && row >= 2 && row <= 4) {
                    System.out.print((char) ((l15 - 3) + alpha + row) + " ");// sc
                }
                if (col == 3 && row >= 2 && row <= 3) {
                    System.out.print((char) (l15 + row + col + alpha + inc) + " ");// sc
                }
                if (col == 3 && row == 4) {
                    System.out.print((char) (lgg + alpha + row+1) + " ");// sc
                }
                if (col == 4 && row >= 2 && row <= 4) {
                    System.out.print((char) (l15 + row + alpha + col - inc) + " ");
                    inc += 2;// sc
                }
                if (col == 5 && row >= 2 && row <= 4) {
                    System.out.print((char) ((l15 -col) - (row - 1)+alpha) + " ");// sc
                }
            }
            System.out.println();
        }

    }

}
