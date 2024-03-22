public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double buf = 0.0;

        for(int i = 0; i < 10; i++)
            buf += arr[i];
        System.out.print(buf / 10.0);
    }
}
