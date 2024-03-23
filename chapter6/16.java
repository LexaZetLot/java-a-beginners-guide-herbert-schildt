class StaticMeth
{
    static int val = 1024;
    static int valDiv2()
    {
        return val / 2;
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        System.out.println("val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
        StaticMeth.val = 4;
        System.out.println("val: " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.valDiv2());
    }
}
