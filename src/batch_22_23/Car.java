package batch_22_23;

public class Car {

    static int numberOfCars = 0;

    String name;
    int n=0;

    public static void main(String[] arg) {
        System.out.println("numberOfCars=" + Car.numberOfCars);
        
        Car car1 = new Car();
        car1.name = "FORD";
        car1.numberOfCars++;
        car1.n++;
        System.out.println("numberOfCars=" + car1.numberOfCars);
        System.out.println("n=" + car1.n);
        Car car2 = new Car();
        car2.name = "Honda";
        car2.n++;
        car2.numberOfCars++;
        System.out.println("numberOfCars=" + car2.numberOfCars);
        System.out.println("n=" + car2.n);
        Car car3 = new Car();
        car3.name = "TATA";
        car3.numberOfCars++;
        car3.n++;
        System.out.println("numberOfCars=" + car3.numberOfCars);
        System.out.println("n=" + car3.n);
    }

}
