public class Main {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread();

        System.out.println("Name main stream: " + thrd.getName());
        System.out.println("Main stream priority: " + thrd.getPriority());
        System.out.println();

        System.out.println("Setting the name and priority.\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("New name main stream: " + thrd.getName());
        System.out.println("New main stream priority: " + thrd.getPriority());
    }
}
