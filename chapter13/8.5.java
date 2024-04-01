public class QueueFullException extends Exception {
    int size;
    QueueFullException(int s) {
        size = s;
    }
    public String toString(){
        return "queue is full maximum size " + size;
    }
}

