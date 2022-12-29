package batch_22_23.Array;

public class TwoD {
    public static void main(String[] arg) {
        /*
         * int[][] a = new int[4][5];
         * for (int row = 0; row < a.length; row++) {
         * System.out.println("row=" + row);
         * for (int col = 0; col < a[row].length; col++) {
         * System.out.print(" col =" + col);
         * }
         * System.out.println("");
         * }
         */

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row >= col) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        for (int row = 0; row < 5; row++) {
            if(row==0) continue;
            for (int col = 0; col < 5; col++) {
                if (row >= col) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

    }
}
