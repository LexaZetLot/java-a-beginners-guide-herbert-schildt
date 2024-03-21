public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int sample[] = new int[10];
        int i;

        for(i = 0; i < 10; i++)
            sample[i] = i;
        for(i = 0; i < 10; i++)
            System.out.println("[" + i + "]: " + sample[i]);
    }
}
