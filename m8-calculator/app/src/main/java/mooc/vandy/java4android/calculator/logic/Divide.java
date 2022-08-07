package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private int value_one;
    private int value_two;
    private int Operation_no;
    private ActivityInterface mOut;
    public Divide(int value_one, int value_two, ActivityInterface mOut)
    {
        this.value_two = value_two;
        this.value_one = value_one;
        this.mOut = mOut;
    }

    public void compute_operation_no() // calculate the addition of the two numbers
    {
        Operation_no = value_one/value_two;
        int rem = value_one%value_two;
        String str = Integer.toString(Operation_no)+" R: "+Integer.toString(rem);
        print(str);
    }

    public int getValueOne() // return the first value
    {
        return value_one;
    }
    public int getValueTwo()  // return the second value
    {
        return value_two;
    }
    public int getOperationNumber()  // return the result value
    {
        return  Operation_no;
    }
    public void print(String resultString)  // print the result value
    {
        mOut.print(resultString);
    }
}
