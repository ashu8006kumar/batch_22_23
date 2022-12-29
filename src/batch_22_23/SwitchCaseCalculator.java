package batch_22_23;

import java.util.Scanner;

public class SwitchCaseCalculator {
    int number1;
    int number2;
    char op;

    public void add() {
        System.out.println("Add");
        System.out.println(number1 + number2);
    }

    public void subtract() {
        System.out.println("subtract");
        System.out.println(number1 - number2);
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        boolean startLoop = true;
        while (startLoop) {
           
            SwitchCaseCalculator scc = new SwitchCaseCalculator();
            System.out.print("Please enter first number=");
            scc.number1 = scanner.nextInt();
            System.out.print("Please enter second number=");
            scc.number2 = scanner.nextInt();
            System.out.print("Please enter op=");
            scc.op = scanner.next().charAt(0);
    
            switch (scc.op) {
                case '+':
                    scc.add();
                    break;
                case '-':
                    scc.subtract();
                    break;
                default:
                    System.out.println("this op not allowed");
            }


           
           
           
            System.out.print("Please enter y for next calculation=");
            startLoop = scanner.next().charAt(0)=='y';
        }

        

    }

}
