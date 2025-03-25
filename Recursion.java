/*
 * Recursion is a process where a method calls itself to solve a problem. 
 * It is useful for solving problems that can be broken down into smaller, 
 * similar subproblems.
 */

public class Recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int result = factorial(5); // Calling the recursive method
        System.out.println("Factorial of n number: " + result);
    }
}
