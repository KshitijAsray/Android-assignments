package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size)
    {
        // TODO -- add your code here
        int n = size;
        if(size==0)
            mOut.println("Wrong size");
        else
        {
            start_end_line(size);
            //Upward Triangle
            int i = 0;
            for(i = 0;i<size-1;i++)
            {
                if(i%2==0)
                {
                    Upward_spaces_forward(n);
                    for(int j = 0;j<i*2;j++)
                    {
                        mOut.print("=");
                    }
                    Upward_spaces_backward(n);
                    mOut.println();
                    n--;
                }
                else
                {
                    Upward_spaces_forward(n);
                    for(int j = 0;j<i*2;j++)
                    {
                        mOut.print("-");
                    }
                    Upward_spaces_backward(n);
                    mOut.println();
                    n--;
                }

            }
            mOut.print("|<");
            for(int k = 0;k<((size-1)*2);k++)
            {
                if(i%2==0)
                    mOut.print("=");
                else
                    mOut.print("-");
            }
            mOut.println(">|");
            //Lower Triangle
            i--;
            int p = 1,l;
            for(l = i;l>=0;l--)
            {
                if(l%2==0)
                {
                    Lower_spaces_forward(p);
                    for(int u = 0;u<l*2;u++)
                    {
                        mOut.print("=");
                    }
                    Lower_spaces_backward(p);
                    mOut.println();
                    p++;
                }
                else
                {
                    Lower_spaces_forward(p);
                    for(int u = 0;u<l*2;u++)
                    {
                        mOut.print("-");
                    }
                    Lower_spaces_backward(p);
                    mOut.println();
                    p++;
                }
            }
            start_end_line(size);
        }

        
    }

    // TODO -- add any helper methods here
    public void start_end_line(int size)
    {
        int m = size;
        mOut.print("+");
        for(int i = 0;i<(m*2);i++)
        {
            mOut.print("-");
        }
        mOut.print("+");
        mOut.println();
    }
    public void Upward_spaces_forward(int size)
    {
        //for(int i = 0;i<size-1;i++)
        //{
            mOut.print("|");
            for(int j = 0;j<size-1;j++)
            {
                mOut.print(" ");
            }
            mOut.print("/");
       //}
    }
    public void Upward_spaces_backward(int size)
    {
        //for(int i = 0;i<size-1;i++)
        //{
            mOut.print("\\");
            for(int j = 0;j<size-1;j++)
            {
                mOut.print(" ");
            }
            mOut.print("|");
        //}
    }
    public void Lower_spaces_forward(int size)
    {
            mOut.print("|");
            for(int j = 0;j<size;j++)
            {
                mOut.print(" ");
            }
            mOut.print("\\");
    }
    public void Lower_spaces_backward(int size)
    {
            mOut.print("/");
            for(int j = 0;j<size;j++)
            {
                mOut.print(" ");
            }
            mOut.print("|");
    }
}
