// Specialized Entity 2 : Motorcycle

public class Motorcycle extends Vehicle {
    private int engineCapacity;
    private double fuelConsumption; // New attribute

    public Motorcycle(String brand, String model, int year, int engineCapacity, double fuelConsumption) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.fuelConsumption = fuelConsumption;
    }
}