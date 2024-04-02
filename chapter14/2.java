interface NumericTest {
    boolean test(int n, int m);
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        NumericTest isFactor = (n, d) -> (n % d) == 0;
        if(isFactor.test(10, 2))
            System.out.println("(10 % 2) == 0");
        if(isFactor.test(10, 3))
            System.out.println("(10 % 3) == 0");
        System.out.println();

        NumericTest lessThan = (n, m) -> (n < m);
        if(lessThan.test(2, 10))
            System.out.println("2 < 10");
        if(!lessThan.test(10, 2))
            System.out.println("!(2 < 10)");
        System.out.println();

        NumericTest absEqual = (n, m) -> (n < 0 ? -n: n) == (m < 0 ? -m: m);
        if(absEqual.test(4, -4))
            System.out.println("abs 4 = -4");
        if(absEqual.test(4, -5))
            System.out.println("abs 4 = -5");
        System.out.println();
    }
}

