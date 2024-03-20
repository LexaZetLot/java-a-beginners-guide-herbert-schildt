public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int num;
        num = 100;

        for(int i = 0; i < num; i++)
        {
            if(i * i >= num)
                break;
            System.out.print(i + " ");
        }
        System.out.println("End");
    }
}
