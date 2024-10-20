package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(float argumentOne, float argumentTwo, int operation) {
        // TODO - Put your code here.
        if(operation==1){
            Add a = new Add();
            float result = a.addition(argumentOne,argumentTwo);
            mOut.print(String.valueOf(result));
        }
        else if(operation==2){
            Subtract s = new Subtract();
            float result = s.subtraction(argumentOne,argumentTwo);
            mOut.print(String.valueOf(result));
        }
        else if(operation==3){
            Multiply m = new Multiply();
            float result = m.multiplication(argumentOne,argumentTwo);
            mOut.print(String.valueOf(result));
        }
        else{
            Divide d = new Divide();
            String result = "";
            try{
                result = d.division(argumentOne,argumentTwo);
                mOut.print(result);
            }
            catch (Exception e){
                mOut.print("Cannot divide by zero");
            }
        }
    }
}
