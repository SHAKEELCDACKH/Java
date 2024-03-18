public class Vehicle {
    String type;
    String color;

    public Vehicle(String vehicleType) {
        type = vehicleType;
    }

    public Vehicle(String vehicleType, String vehicleColor) {
        type = vehicleType;
        color = vehicleColor;
    }

    public void displayDetails() {
        System.out.println("Vehicle Type: " + type);

        if (color != null) {
            System.out.println("Color: " + color);
        }
    }

    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Sedan");
        car1.displayDetails(); 

        Vehicle truck1 = new Vehicle("Truck", "Blue");
        truck1.displayDetails(); 
    }
}
