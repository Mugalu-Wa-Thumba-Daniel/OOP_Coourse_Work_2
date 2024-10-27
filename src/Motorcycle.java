// Specialized Entity 2 : Motorcycle

public class Motorcycle extends Vehicle {
    private int engineCapacity;
    private double fuelConsumption; // New attribute

    public Motorcycle(String brand, String model, int year, int engineCapacity, double fuelConsumption) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n\t The Motorcycle's Brand is \t\t: " + getBrand() + "\n\t THe Model Of the Motorwycle is : " + getModel() + "\n\t The Engine Capacity is \t\t:" + engineCapacity);
    }
}