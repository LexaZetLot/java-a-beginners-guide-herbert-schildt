class MyTread implements  Runnable{
    String thrdName;
    MyTread(String name){
        thrdName = name;
    }
    public void run(){
        System.out.println("Stream " + thrdName + " activate");
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("Stream " + thrdName + " i = " + i);
            }
        }
        catch (InterruptedException exc){
            System.out.println("Stream " + thrdName + " interrupted.");
        }
        System.out.println("Stream " + thrdName + " finalized.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main stream activate");
        MyTread mt = new MyTread("Child #1");
        Thread newThrd = new Thread(mt);
        newThrd.start();

        for(int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main stream interrupted");
            }
        }
        System.out.println("Main stream finalized");
    }
}
