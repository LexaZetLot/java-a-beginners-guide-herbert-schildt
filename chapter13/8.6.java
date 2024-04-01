public class CircularQueue<T> implements IGenQ<T> {
    private T[] q;
    private int putloc, getloc;

    public CircularQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T ch) throws QueueFullException {
        if (putloc + 1 == getloc || ((putloc == q.length - 1) && (getloc == 0)))
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
        if (putloc == q.length)
            putloc = 0;
    }

    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        if (getloc == q.length)
            getloc = 0;
        return q[getloc++];
    }
}
