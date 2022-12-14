package batch_22_23;

public class Assignment {

    public static void main(String[] agr) {
        String name = "Ashish Kumar";
        String newName = "Arha Sharma";

        name = newName;
        System.out.println("-_-_-_-_-_-_START-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        // System.out.println("name");

        System.out.println(name);
        System.out.println(newName);

        System.out.println("-_-_-_-_-_-_END_-_-_-_-_-_-_-_-_-_-_-_-_-");

        int number1 = 12, number2 = 4;

        System.out.println("-_-_-_-_-_-_START-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        number1 -= number2;
        /*
          number1=number1%number2


         */
        System.out.println(number1);
        System.out.println(number2);
        System.out.println("-_-_-_-_-_-_END_-_-_-_-_-_-_-_-_-_-_-_-_-");


        System.out.println("-_-_-_-_-_-_Ternary Operator-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        
        String r= number1==0 ?"number1 is zero":"non zero number1" ;
    
        /*
          if number one is zero 
          print "number1 is zero"
          else 
           non zero number1 

         */
        System.out.println(number1);
        System.out.println(r);
        System.out.println("-_-_-_-_-_-_END_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }

}
