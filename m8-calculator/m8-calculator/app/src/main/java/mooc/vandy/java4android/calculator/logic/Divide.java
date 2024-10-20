package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    public String division(float argumentOne, float argumentTwo) {
        if (argumentTwo == 0) {
            throw new ArithmeticException("Division by zero is undefined.");
        }
        double ans = (double)argumentOne / argumentTwo;
        return  ans + "";
    }
}
