// Specialized Entity 1 : Car

public class Car extends Vehicle {
    private double maxSpeed;
    private double fuelConsumption; // New attribute

    public Car(String brand, String model, int year, double maxSpeed, double fuelConsumption) {
        super(brand, model, year);
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n\t The Car's Brand is \t\t\t: " + getBrand() + "\n\t The Car's Model is \t\t\t: " + getModel() + "\n\t The Car's Maximum Speed is \t: " + maxSpeed);
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }
}