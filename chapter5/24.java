public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        char ch;

        for(int i = 0; i < 10; i++)
        {
            ch = (char)('a' + i);
            System.out.print(ch);
            ch = (char)((int) ch & 65503);
            System.out.print(ch + " ");
        }
    }
}
