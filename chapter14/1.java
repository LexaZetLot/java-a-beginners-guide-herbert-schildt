interface MyValue {
    double getValue();
}
interface MyParamValue {
    double getValue(double v);
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        MyValue myVal;
        myVal = () -> 98.6;
        System.out.println(myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println(myPval.getValue(4.0));
        System.out.println(myPval.getValue(8.0));
    }
}

