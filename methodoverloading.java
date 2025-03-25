// Method overloading 

/*
 * Method overloading allows you to define multiple methods
 *  with the same name but different parameter lists 
 * (different number or types of parameters).
 */
//Example One

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println(calc.add(5, 7)); // Call the first add method
            System.out.println(calc.add(3.5, 5.5)); // call the second add method
            System.out.println(calc.add(5, 7, 6)); // Call the third add method
        }
    }
}