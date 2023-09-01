public class Main {
    public static void main(String[] args) {
        Vehicle x = new Vehicle();
        x.setColor("Blue");
        x.setEngineSize(1000);
        x.setFuelType("Regular");
        x.setNumberOfWheels(4);
        x.getInfo();
        System.out.println();

        Car y = new Car();
        y.setColor("Blue");
        y.setEngineSize(1000);
        y.setFuelType("Regular");
        y.setNumberOfWheels(4);
        y.setBrand("BMW");
        y.displayInfo();
        y.honk();
    }
}