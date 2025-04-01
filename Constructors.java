//Constructors and Their Types
/*
 * Constructor: Special method that initializes objects.

Types:

Default Constructor (No arguments)

Parameterized Constructor (Takes arguments)
 */

//Example One
class Smartphone {
    String model;
    int storageGB;

    // Default constructor
    Smartphone() {
        model = "Unknown";
        storageGB = 128;
        System.out.println("Default smarthphone created");
    }

    // Parameterized constructor
    Smartphone(String m, int storage) {
        model = m;
        storageGB = storage;
        System.out.println(" smarth phone with " + storageGB + "GB");
    }

}

public class Constructors {
    public static void main(String[] args) {
        // For default
        Smartphone phone1 = new Smartphone();

        // For parameterized
        Smartphone phone2 = new Smartphone("Iphone 15", 256);
    }
}
