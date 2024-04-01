public class Main {
    public static void main(String[] args) {
        Integer[] iStore = new Integer[10];
        GenQueue<Integer> q1 = new GenQueue<Integer>(iStore);
        Integer iVal;

        System.out.println("Work demonstration Integer.");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Put " + i);
                q1.put(i);
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        try {
            for(int i = 0; i < 5; i++){
                System.out.print("Get ");
                iVal = q1.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        Double[] dStore = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);
        Double dVal;
        System.out.println("Work demonstration Double.");
        try {
            for(int i = 0; i < 5; i++) {
                System.out.println("Put " + (double) i / 2);
                q2.put((double) i / 2);
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();
        try {
            for(int i = 0; i < 5; i++){
                System.out.print("Get ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
