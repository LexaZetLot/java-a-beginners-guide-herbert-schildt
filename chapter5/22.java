public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        System.out.println("There are " + args.length + " command-line arguments.");

        System.out.println("They are: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
