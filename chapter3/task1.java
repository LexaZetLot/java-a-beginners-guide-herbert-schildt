public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        char ch = 0;
        int num = 0;

        while(ch != '.')
        {
            ch = (char)System.in.read();
            if(ch == ' ')
                num++;
        }
        System.out.print(num);
    }
}
