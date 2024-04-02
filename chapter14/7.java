interface MyFunc {
    int func(int str);
}
public class Main {
    public static void main(String[] args) {
        int num = 10;
        MyFunc myLambda = (n) -> {
            int v = num + n;
            return v;
        };
        System.out.println(myLambda.func(8));
    }
}

