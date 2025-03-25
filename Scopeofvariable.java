/*
 * Scope and Lifetime of Variables
 * 4.1 Scope of Variables
Local Variables: Variables declared inside a method. 
They are accessible only within that method.

Instance Variables: Variables declared inside a class but outside any method. 
They are accessible to all methods in the class.

Class Variables (Static Variables): Variables declared with the static keyword.
They are shared across all instances of the class.

4.2 Lifetime of Variables
Local Variables: Exist only during the execution of the method.

Instance Variables: Exist as long as the object of the class exists.

Class Variables: Exist for the entire runtime of the program.
 */

//Example of Scope and Lifetime of Variables
public class Scopeofvariable {
    static int classVar = 10; // Class variable
    int instanceVar = 20; // Instance variable

    void method() {
        int localVar = 30; // Local variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        // Mains obj = new Mains();
        System.out.println("Class Variable: " + classVar);
        // System.out.println("Instance Variable: " + obj.instanceVar);
        // obj.method();
    }
}