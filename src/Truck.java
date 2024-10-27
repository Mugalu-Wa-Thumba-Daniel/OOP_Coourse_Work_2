// Specialized Entity 2 : Truck

public class Truck extends Vehicle {
    private int cargoCapacity;
    private double fuelConsumption; // New attribute

    public Truck(String brand, String model, int year, int cargoCapacity, double fuelConsumption) { // The Truck
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
        this.fuelConsumption = fuelConsumption;
    }
}