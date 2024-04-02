import java.util.function.Predicate;
interface  NumericFunc {
    int func(int n);
}

public class Main {
    public static void main(String[] args) {
        NumericFunc fp = (n) -> {
            int resuclt = 1;
            for (int i = 1; i <= n; i++)
                resuclt = i * resuclt;
            return resuclt;
        };
        System.out.println(fp.func(12));
    }
}
