class SumArray{
    private int sum;
    synchronized int sumArray(int[] nums){
        sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            System.out.println("Subtotal in flow " + Thread.currentThread().getName() + " = " + sum);
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException exc){
                System.out.println("Stream interrupted");
            }
        }
        return sum;
    }
}
class MyThread implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    MyThread(String name, int[] nums){
        thrd = new Thread(this, name);
        a = nums;
    }
    public static MyThread createAndStart(String name, int[] nums){
        MyThread myThrd = new MyThread(name, nums);
        myThrd.thrd.start();
        return myThrd;
    }
    public void run() {
        int sum;

        System.out.println("Stream " + thrd.getName() + "activate");
        answer = sa.sumArray(a);
        System.out.println("Sum in stream " + thrd.getName() + " = " + answer);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        MyThread mt1 = MyThread.createAndStart("Child #1", a);
        MyThread mt2 = MyThread.createAndStart("Child #2", a);
        try{
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("main stream interrupted");
        }
    }
}
