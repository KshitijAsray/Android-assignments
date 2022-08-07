package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int value_one;
    private int value_two;
    private int Operation_no;

    public void compute_operation_no()
    {
        Operation_no = value_one*value_two;
        print(Integer.toString(Operation_no));
    }
    private ActivityInterface mOut;
    public Multiply(int value_one,int value_two,ActivityInterface mOut)
    {
        this.value_two = value_two;
        this.value_one = value_one;
        this.mOut = mOut;
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
