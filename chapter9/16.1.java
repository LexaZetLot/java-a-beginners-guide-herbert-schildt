class FixedQueue implements ICharQ
{
    private char[] q;
    private  int putloc, getloc;

    public FixedQueue(int size)
    {
        q = new char[size];
        putloc = getloc = 0;
    }
    public void put(char ch) throws QueueFullException
    {
        if(putloc == q.length)
            throw new QueueFullException(q.length);
        q[putloc++] = ch;
    }
    public char get() throws QueueEmptyException
    {
        if(getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }
    public void reset()
    {
        for(int i = 0; i < q.length; i++)
            q[i] = '\0';
        putloc = getloc = 0;
    }
}
class CircularQueue implements ICharQ
{
    private char[] q;
    private int putloc, getloc;

    public CircularQueue(int size)
    {
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    public void put(char ch) throws QueueFullException
    {
        if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0)))
            throw new QueueFullException(q.length);
        q[putloc++] = ch;
        if(putloc == q.length)
            putloc = 0;
    }
    public  char get() throws QueueEmptyException
    {
        if(getloc == putloc)
            throw new QueueEmptyException();
        char ch = q[getloc++];
        if(getloc == q.length)
            getloc = 0;
        return ch;
    }
    public void reset()
    {
        for(int i = 0; i < q.length; i++)
            q[i] = '\0';
        putloc = getloc = 0;
    }
}
class DynQueue implements ICharQ
{
    private char[] q;
    private int putloc, getloc;

    public DynQueue(int size)
    {
        q = new char[size];
        putloc = getloc = 0;
    }
    public void put(char ch) throws QueueFullException
    {
        if(putloc == q.length)
        {
            char[] t = new char[q.length * 2];
            for(int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
    }
    public char get() throws QueueEmptyException
    {
        if(getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }
    public void reset()
    {
        for(int i = 0; i < q.length; i++)
            q[i] = '\0';
        putloc = getloc = 0;
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try
        {
            for (i = 0; i < 11; i++)
            {
                System.out.print("Attempting to store: " + (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc)
        {
            System.out.println(exc);
        }
        System.out.println();

        try
        {
            for (i = 0; i < 11; i++)
            {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}

