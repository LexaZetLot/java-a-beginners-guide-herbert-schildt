package qpack;

public class CircularQueue implements ICharQ
{
    private char[] q;
    private int putloc, getloc;

    public CircularQueue(int size)
    {
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    public void put(char ch)
    {
        if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0)))
        {
            System.out.println(" - Queue full.");
            return;
        }
        q[putloc++] = ch;
        if(putloc == q.length)
            putloc = 0;
    }
    public  char get()
    {
        if(getloc == putloc)
        {
            System.out.println(" - Queue empty.");
            return (char) 0;
        }
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
