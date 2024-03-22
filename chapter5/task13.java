public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min = 1000000, max = -1000000;

        for (int i: nums)
        {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        System.out.println("min and max: " + min + " " + max);
    }
}

