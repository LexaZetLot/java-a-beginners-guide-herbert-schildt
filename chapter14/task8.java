interface  NumericFunc<T> {
    T func(T n);
}

public class Main {
    public static void main(String[] args) {
        NumericFunc<Double> fp = (n) -> {
            double resuclt = 1.0;
            for (double i = 1.0; i <= n; i++)
                resuclt = i * resuclt;
            return resuclt;
        };
        System.out.println(fp.func(12.0));
    }
}

