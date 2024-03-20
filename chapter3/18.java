public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        char ch;

        do
        {
            System.out.print("press to key: ");
            ch = (char)System.in.read();
        }while (ch != 'q');
    }
}
