// Loops are used to repeat a block of code multiple times.

/*
 * (a) for Loop
The for loop is used when the number of iterations is known.

(b) while Loop
The while loop is used when the number of iterations is 
unknown and depends on a condition.
(c) do-while Loop
The do-while loop guarantees at least one execution, 
even if the condition is false.


 */
public class loopStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Iteration: " + j + " " + i);
            }
            System.out.println("Iteration: " + i);

        }
    }
}
