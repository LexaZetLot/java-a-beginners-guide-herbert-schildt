package qpack;

public class FixedQueue implements ICharQ
{
    private char[] q;
    private  int putloc, getloc;

    public FixedQueue(int size)
    {
        q = new char[size];
        putloc = getloc = 0;
    }
    public void put(char ch)
    {
        if(putloc == q.length)
        {
            System.out.println(" - Queue full.");
            return;
        }
        q[putloc++] = ch;
    }
    public char get()
    {
        if(getloc == putloc)
        {
            System.out.println(" - Queue empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
    public void reset()
    {
        for(int i = 0; i < q.length; i++)
            q[i] = '\0';
        putloc = getloc = 0;
    }
}