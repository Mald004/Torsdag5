package Task1;

public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("someone",10,1998,"cool");
        Driver driver1 = new Driver("Hans",20);

        car1.setDriver(driver1);
        System.out.println(driver1);
    }
}