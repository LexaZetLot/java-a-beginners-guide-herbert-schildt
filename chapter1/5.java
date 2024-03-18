public class Main
{
    public static void main(String[] args)
    {
        int a, b, c;

        a = 2;
        b = 3;

        if(a < b)
            System.out.println("a < b");

        System.out.println();
        c = a - b;

        System.out.println("c = -1");
        if(c >= 0)
            System.out.println("c != -");
        if(c < 0)
            System.out.println("c == -");

        System.out.println();
        c = b - a;

        System.out.println("c = 1");
        if(c >= 0)
            System.out.println("c != -");
        if(c < 0)
            System.out.println("c == -");
    }
}
