package batch_22_23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExHandling {
    public static void main(String[] agr) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),
                b = scanner.nextInt();
        System.out.println(a / b);

        try {
            FileInputStream f = new FileInputStream("");
        } catch (FileNotFoundException e) {
           throw new RuntimeException("My ouwn message");
        }

        System.out.println("program ends here");
        System.out.println("program ends here");
        System.out.println("program ends here");
        System.out.println("program ends here");
        System.out.println("program ends here");
        System.out.println("program ends here");
    }
}
