package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    public String division(int argumentOne, int argumentTwo) {
        if (argumentTwo == 0) {
            throw new ArithmeticException("Division by zero is undefined.");
        }
        return (argumentOne / argumentTwo) +"R: " + (argumentOne%argumentTwo);
    }
}
