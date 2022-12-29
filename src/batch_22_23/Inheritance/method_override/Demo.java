package batch_22_23.Inheritance.method_override;

public class Demo {// run time time
    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.whoIam();
        Child child= new Child();
        child.whoIam(); 
    }
}
