public class Vehicle {
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;
    public Vehicle(){
        numberOfWheels = 0;
        color = "no color";
        engineSize = 0;
        fuelType = "no fuel type";
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void getInfo(){
        System.out.println("Color " + color);
        System.out.println("Engine size " + engineSize);
        System.out.println("Fuel type " + fuelType);
        System.out.println("Number of wheels " + numberOfWheels);
    }
}
