package batch_22_23.method_overload;

public class Hello {// compile time
    public static void main(String[] args) {
        Demo demo= new Demo();
        demo.sum();
        demo.sum(1);
        demo.sum(1,5);

        demo.sum("Ashish ", "kumar");
    }
}
