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
    boolean adsEqual(NumericEns<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}
public class Main {
    public static void main(String[] args) throws java.io.IOException {
        NumericEns<Integer> iOb = new NumericEns<Integer>(6);
        NumericEns<Double> dOb = new NumericEns<Double>(-6.0);
        NumericEns<Long> lOb = new NumericEns<Long>(5L);

        System.out.println("iOb and dOb.");
        if(iOb.adsEqual(dOb))
            System.out.println("=");
        else
            System.out.println("!=");
        System.out.println();

        System.out.println("iOb and lOb.");
        if(iOb.adsEqual(lOb))
            System.out.println("=");
        else
            System.out.println("!=");
    }
}
