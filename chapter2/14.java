public class Main
{
    public static void main(String[] args)
    {
        int i;
        i = 0;

        if(false & (++i < 100))
            System.out.println("+: " + i);
        System.out.println("+: " + i);

        if(false && (++i < 100))
            System.out.println("+: " + i);
        System.out.println("+: " + i);
    }
}
