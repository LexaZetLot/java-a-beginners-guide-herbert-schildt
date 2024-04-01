import java.lang.reflect.Array;

public class DynQueue<T> {
    private T[] q;
    private int putloc, getloc;

    public DynQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T ch, Class<T> klass) throws QueueFullException{
        if (putloc == q.length) {
            T[] t  = (T[]) Array.newInstance(klass, q.length * 2);

            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;
    }

    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
