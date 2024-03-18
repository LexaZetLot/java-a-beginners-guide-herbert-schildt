public class Main
{
    public static void main(String[] args)
    {
        double d, m;
        int counter;

        counter = 0;
        for(d = 1; d <= 100; d++)
        {
            m = d * 39.37;
            System.out.println("d: " + d + " m: " + m);

            counter++;
            if(counter == 12)
            {
                System.out.println();
                counter = 0;
            }
        }

    }
}
