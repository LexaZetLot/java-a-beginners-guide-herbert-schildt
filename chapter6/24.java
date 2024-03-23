public class Main
{
    static void vaTest(int ... v)
    {
    }

    // Use a boolean vararg parameter.
    static void vaTest(boolean ... v)
    {
    }

    public static void main(String[] args) throws java.io.IOException
    {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        vaTest();
    }
}
