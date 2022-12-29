package batch_22_23;

public class SwitchCase {
    public static void main(String[] agr) {
        String gender = "FEMALE";
        System.out.println("=================START===========================");
        switch (gender) {
            case "MALE":
                System.out.println("you selected male");
                break;
            case "FEMALE":
                System.out.println("you selected female");
                break;
            default:
                System.out.println("UNKNOWN");
        }
        System.out.println("=================END===========================");
    }
}
