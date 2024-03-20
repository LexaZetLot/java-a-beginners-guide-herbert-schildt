class Factor
{
    boolean isFactor(int a, int b)
    {
        if((b % a) == 0)
            return true;
        else
            return false;
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Factor x = new Factor();

        if(x.isFactor(2, 20))
            System.out.println("20 % 2 == 0");
        if(x.isFactor(3, 30))
            System.out.println("20 % 3 == 0");
    }
}
