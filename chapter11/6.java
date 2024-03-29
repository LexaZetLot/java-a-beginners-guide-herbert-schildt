class MyTread implements  Runnable{
    Thread thrd;
    MyTread(String name){
        thrd = new Thread(this, name);
    }
    public static MyTread createAndStart(String name){
        MyTread myTread = new MyTread(name);
        myTread.thrd.start();
        return myTread;
    }

    public void run(){
        System.out.println("Stream " + thrd.getName() + " activate");
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("Stream " + thrd.getName() + " i = " + i);
            }
        }
        catch (InterruptedException exc){
            System.out.println("Stream " + thrd.getName() + " interrupted.");
        }
        System.out.println("Stream " + thrd.getName() + " finalized.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main stream activate");
        MyTread mt1 = MyTread.createAndStart("Child #1");
        MyTread mt2 = MyTread.createAndStart("Child #2");
        MyTread mt3 = MyTread.createAndStart("Child #3");

        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main stream interrupted");
            }
        }while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());
        System.out.println("Main stream finalized");
    }
}
