class TickTock {
    String state;

    synchronized void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked"))
                wait();
        }
        catch (InterruptedException exc){
            System.out.println("Stream interrupted");
        }
    }
    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while (!state.equals("ticked"))
                wait();
        }
        catch (InterruptedException exc) {
            System.out.println("Stream interrupted");
        }
    }
}
class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOd;

    MyThread(String name, TickTock tt){
        thrd = new Thread(this, name);
        ttOd = tt;
    }
    public static MyThread createAndStart(String name,TickTock tt){
        MyThread myThrd = new MyThread(name, tt);
        myThrd.thrd.start();
        return myThrd;
    }
    public void run() {
        if(thrd.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++)
                ttOd.tick(true);
            ttOd.tick(false);
        }
        else {
            for(int i = 0; i < 5; i++)
                ttOd.tock(true);
            ttOd.tock(false);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt1 = MyThread.createAndStart("Tick", tt);
        MyThread mt2 = MyThread.createAndStart("Tock", tt);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Main stream interrupted");
        }
    }
}
