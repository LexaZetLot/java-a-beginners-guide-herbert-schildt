public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int i;
        for(i = 0; i <= 100; i++)
        {
            if((i % 2) != 0)
                continue;
            System.out.println(i);
        }
    }
}
