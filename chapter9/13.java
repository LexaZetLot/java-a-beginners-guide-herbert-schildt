public class Main
{
    public static char prompt(String str) throws  java.io.IOException
    {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }
    public static void main(String[] args)
    {
        char ch;
        try
        {
            ch = prompt("Enter a latter");
        }
        catch(java.io.IOException exc)
        {
            System.out.println("I/O exception occurred");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}
