class Overload
{
    void ovlDemo()
    {
        System.out.println("No Parameters");
    }
    void ovlDemo(int a)
    {
        System.out.println("One Parameters");
    }
    int ovlDemo(int a, int b)
    {
        System.out.println("Two Parameters");
        return a + b;
    }

    double ovlDemo(double a, double b)
    {
        System.out.println("Two Parameters Double: " + a + " " + b);
        return a + b;
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Overload ob = new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}
