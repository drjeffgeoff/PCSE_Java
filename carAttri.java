//Define a class (Blueprint)
class Car {
    // Attributes
    String brand;
    String color;

    // Method (Behavior)
    void drive() {
        System.out.println(color + " " + brand + " is driving");
    }
}

public class carAttri {
    public static void main(String[] args) {
        // Create objects (Instance)
        Car myCar = new Car();
        // Set Attributes
        myCar.brand = "Jeep";
        myCar.color = "green";
    }
}
