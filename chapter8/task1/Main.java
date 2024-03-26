import qpack.*;

public class Main
{
    static void copy(ICharQ iQ1, ICharQ iQ2, int size)
    {
        char ch = '0';
        iQ1.reset();
        for (int i = 0; i < size; i++)
        {
            ch = iQ2.get();
            iQ1.put(ch);
        }
    }
    public static void main(String[] args) throws java.io.IOException
    {
        FixedQueue q1 = new FixedQueue(10);
        FixedQueue q4 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;
        ICharQ iQ2;

        char ch;
        int i;
        iQ = q1;
        iQ2 = q4;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        copy(iQ2, iQ, 10);
        System.out.print("Contents of fixed queue: ");
        for (i = 0; i < 10; i++)
        {
            ch = iQ2.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        System.out.print("Contents of dynamic queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++)
        {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++)
        {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nStore and consume from circular queue.");
        for (i = 0; i < 20; i++)
        {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
