// Abstract Entity: Vehicle

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public abstract void displayDetails();
    public abstract double getFuelConsumption(); // New method
}