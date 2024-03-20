public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int num = 1;
        for(int i = 0; i < 10; i++, num = 1)
        {
            for (int j = 0; j < i; j++)
                num *= 2;
            System.out.print(num + " ");
        }
    }
}
