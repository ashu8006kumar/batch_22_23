package batch_22_23.Array;

public class BasicArray {
    public static void main(String[] agr) {

        int[] rollNumbers = new int[9];
        rollNumbers[0] = 7;
        rollNumbers[1] = 11;
        rollNumbers[2] = 6;
        rollNumbers[3] = 55;
        rollNumbers[4] = 98;
        rollNumbers[5] = 45;
        rollNumbers[6] = 16;
        rollNumbers[7] = 96;
        rollNumbers[8] = 46;

        for (int index = 0; index < rollNumbers.length; index++) {
            System.out.println(rollNumbers[index]);
        }
        System.out.println("--------While----------");
        int index = 0;
        while (index < rollNumbers.length){
            System.out.println(rollNumbers[index]);
            index++;
        }
        System.out.println("--------For----------");

        for(int roleNumber: rollNumbers ){
            System.out.println(roleNumber);
        }

    }
}
