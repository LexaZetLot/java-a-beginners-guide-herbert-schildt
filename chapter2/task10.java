public class Main
{
    public static void main(String[] args)
    {
        boolean isprime;
        for (int i = 2; i < 100; i++)
        {
            isprime = true;
            for (int j = 2; j <= i / j; j++)
                if((i % j) == 0)
                    isprime = false;

            if(isprime)
                System.out.println(i);
        }
    }
}
