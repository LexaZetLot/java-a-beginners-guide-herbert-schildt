interface SomeTest<T> {
    boolean test(T n, T m);
}
public class Main {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;
        if(isFactor.test(10, 2))
            System.out.println("(10 % 2) == 0");
        System.out.println();

        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;
        if(isFactorD.test(212.0, 4.0))
            System.out.println("(212.0 % 4.0) == 0");
        System.out.println();

        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "Generic Functional Interface";
        System.out.println("Str: " + str);
        if(isIn.test(str, "face"))
            System.out.println("String face found");
        else
            System.out.println("String face not found");
    }
}

