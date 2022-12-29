package batch_22_23;

public class IfElseCalculator {
    public static void main(String[] arg) {
        int number1 = 30;
        int number2 = 3;
        char op = '8';
        System.out.println("=================START===========================");
        if (op == '+') {
            System.out.println("You have selected addition");
            System.out.println(number1 + number2);
        } else if (op == '*') {
            System.out.println("You have selected multiply");
            System.out.println(number1 * number2);
        } else if (op == '-') {
            System.out.println("You have selected subtraction");
            System.out.println(number1 - number2);
        } else if (op == '/') {
            System.out.println("You have selected division");
            System.out.println(number1 / number2);
        } else {
            System.out.println("UNKNOWN");
        }
        System.out.println("=================END===========================");
    }
}
