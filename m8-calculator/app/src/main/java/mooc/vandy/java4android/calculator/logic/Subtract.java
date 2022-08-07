package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private int value_one;
    private int value_two;
    private int Operation_no;
    private ActivityInterface mOut;
    public Subtract(int value_one,int value_two,ActivityInterface mOut)
    {
        this.value_two = value_two;
        this.value_one = value_one;
        this.mOut = mOut;
    }

    public void compute_operation_no()
    {
        Operation_no = value_one-value_two;
        print(Integer.toString(Operation_no));
    }

    public int getValueOne()
    {
        return value_one;
    }
    public int getValueTwo()
    {
        return value_two;
    }
    public int getOperationNumber()
    {
        return  Operation_no;
    }
    public void print(String resultString)
    {
        mOut.print(resultString);
    }
}
