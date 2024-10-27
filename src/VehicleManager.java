// Polymorphic Behavior:VehicleManager

public class VehicleManager {
    public static void displayVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            System.out.println("\t Fuel Consumption \t\t\t\t: " + vehicle.getFuelConsumption() + " L/100km");
        }
    }
}