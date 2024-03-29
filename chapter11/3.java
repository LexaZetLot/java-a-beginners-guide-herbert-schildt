class MyTread extends Thread{
    MyTread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Stream " + getName() + " activate");
        try{
            for(int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("Stream " + getName() + " i = " + i);
            }
        }
        catch (InterruptedException exc){
            System.out.println("Stream " + getName() + " interrupted.");
        }
        System.out.println("Stream " + getName() + " finalized.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main stream activate");
        MyTread mt = new MyTread("Child #1");
        mt.start();

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
