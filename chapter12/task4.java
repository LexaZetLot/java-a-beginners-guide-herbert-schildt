enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);
    private int color;
    TrafficLightColor (int c) {
        color = c;
    }
    int getColor(){return color;}
}
class TrafficLightSimulation implements Runnable {
    private TrafficLightColor tlc;
    private boolean stop = false;
    private boolean changed = false;

    TrafficLightSimulation(TrafficLightColor init) {
        tlc = init;
    }
    TrafficLightSimulation() {
        tlc = TrafficLightColor.RED;
    }

    public void run(){
        while (!stop){
            try {
                Thread.sleep(tlc.getColor());
            }
            catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    synchronized void changeColor(){
        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify();
    }
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait();
            changed = false;
        }
        catch (InterruptedException exc){
            System.out.println(exc);
        }
    }
    synchronized  TrafficLightColor getColor() {
        return tlc;
    }
    synchronized void cancel(){
        stop = true;
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        TrafficLightSimulation t1 =
                new TrafficLightSimulation(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();
        for(int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
