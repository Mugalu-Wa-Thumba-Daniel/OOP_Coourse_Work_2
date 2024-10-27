// Specialized Entity 1 : Car

public class Car extends Vehicle {
    private double maxSpeed;
    private double fuelConsumption; // New attribute

    public Car(String brand, String model, int year, double maxSpeed, double fuelConsumption) {
        super(brand, model, year);
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }
}