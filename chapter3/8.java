public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++)
        {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);

            rerr = num - (sroot * sroot);
            System.out.println("Rounding errors is " + rerr);
            System.out.println();
        }
    }
}
