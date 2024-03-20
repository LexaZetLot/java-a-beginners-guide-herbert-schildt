public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        char ch;

        for(;;)
        {
            ch = (char)System.in.read();
            if(ch == 'q')
                break;
        }
    }
}
