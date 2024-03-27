public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] denom = { 2, 0, 4, 4, 0, 8 };

        for (int i = 0; i < numer.length; i++)
            try
            {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i]/denom[i]);
            }
            catch (ArithmeticException exc)
            {
                System.out.println("Can't divide by Zero!");
            }
            catch (Throwable exc)
            {
                System.out.println("Some exceptions occurred.");
            }
    }
}

