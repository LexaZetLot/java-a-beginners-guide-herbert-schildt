class NumericEns<T extends Number> {
    T num;

    NumericEns(T n) {
        num = n;
    }
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    double fraction(){
        return  num.doubleValue() - num.intValue();
    }
}
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        NumericEns<Integer> iOb =
                new NumericEns<Integer>(5);

        System.out.println("Revers value: " + iOb.reciprocal());
        System.out.println("Fractional part: " + iOb.fraction());
        System.out.println();

        NumericEns<Double> dOb = new NumericEns<Double>(5.25);
        System.out.println("Revers value: " + dOb.reciprocal());
        System.out.println("Fractional part: " + dOb.fraction());
    }
}
