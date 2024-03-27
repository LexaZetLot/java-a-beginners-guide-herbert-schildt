class ExcTest
{
    static void getException() {
        int[] nums = new int[4];

        System.out.println("Before exception is generated");

        nums[7] = 10;
        System.out.println("This won't be displayed");
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        try
        {
            ExcTest.getException();
        }
        catch (ArrayIndexOutOfBoundsException exc)
        {
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");

            exc.printStackTrace();
        }
        System.out.println("After catch statement");
    }
}
