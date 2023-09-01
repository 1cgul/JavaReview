public class Car extends Vehicle{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Number of wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine size: " + getEngineSize());
        System.out.println("Fuel type: " + getFuelType());

    }
}
