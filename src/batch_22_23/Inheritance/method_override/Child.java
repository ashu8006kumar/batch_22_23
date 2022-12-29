package batch_22_23.Inheritance.method_override;

public class Child  extends Parent{
    @Override
    void whoIam() {
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("I am Child.");
        System.out.println("++++++++++++++++++++++++++");
    }
}
