interface  IntPredicate {
    boolean test(int n);
}
class MyIntNum {
    private int v;
    MyIntNum(int x) {v = x;}
    int getNum() {return v;}
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
public class Main {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum1 = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum1::isFactor;

        result = ip.test(3);
        if(result)
            System.out.println("3 % " + myNum1.getNum() + " == 0");

        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result)
            System.out.println("!( 3 % " + myNum2.getNum() + ") != 0");
    }
}

