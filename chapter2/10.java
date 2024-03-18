public class Main
{
    public static void main(String[] args)
    {
        int count;

        for(count = 0; count < 10; count = count + 1)
        {
            System.out.println("count: " + count);
            int count;
            for(count = 0; count < 2; count++)
                System.out.println("error");
        }
    }
}

