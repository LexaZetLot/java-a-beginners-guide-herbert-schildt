public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int x: nums)
        {
            System.out.println("x: " + x);
            sum += x;
        }
        System.out.println("Sum: " + sum);
    }
}
