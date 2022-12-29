package batch_22_23.loops;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 6;
        System.out.println("+++++++++++While Start+++++++++");

        while (counter <= 5) {
            System.out.print("counter=");
            System.out.println(counter);
            counter++;
        }
        System.out.println("+++++++++++While Ends+++++++++");

        System.out.println("+++++++++++DO While Start+++++++++");
        counter = 6;
        do {
            System.out.print("counter=");
            System.out.println(counter);
            counter++;
        } while (counter <= 5);
        System.out.println("+++++++++++DO While Ends+++++++++");
    }
}
