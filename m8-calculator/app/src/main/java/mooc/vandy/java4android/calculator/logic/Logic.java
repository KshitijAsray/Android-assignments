package mooc.vandy.java4android.calculator.logic;

import android.widget.Switch;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
@SuppressWarnings("DuplicateBranchesInSwitch")
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
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.

        switch(operation)
        {
            case 1 :
            {
                Add add = new Add(argumentOne,argumentTwo,mOut);
                add.compute_operation_no();
                break;
            }
            case 2 :
            {
                Subtract sub = new Subtract(argumentOne,argumentTwo,mOut);
                sub.compute_operation_no();
                break;
            }
            case 3 :
            {
                Multiply mul = new Multiply(argumentOne,argumentTwo,mOut);
                mul.compute_operation_no();
                break;
            }
            case 4 :
            {
                Divide div = new Divide(argumentOne,argumentTwo,mOut);
                div.compute_operation_no();
                break;
            }
            default:
            {
                Add add1 = new Add(argumentOne,argumentTwo,mOut);
                add1.compute_operation_no();
                break;
            }
        }
        
    }
}
