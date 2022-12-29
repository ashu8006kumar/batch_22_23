package batch_22_23.Array;

/**
 * 
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class NestedLoopSum {

    public static void main(String arg[]) {

        int counter=1;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row >= col) {
                    System.out.print(counter++);
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
