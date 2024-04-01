class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb() {
        return ob;
    }
}
public class Main {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String>strOb = new Gen<String>("Testing generalizations");
        Gen raw = new Gen(98.6);

        double d = (Double) raw.getOb();
        System.out.println("Value: " + d);

        // int i = (Integer) raw.getOb();
        strOb = raw;
        // String str = strOb.getOb();
        raw = iOb;
        // d = (Double) raw.getOb();
    }
}
