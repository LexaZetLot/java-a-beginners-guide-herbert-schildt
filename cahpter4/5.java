class ChkNum
{
    boolean isEven(int x)
    {
        if((x % 2) == 0)
            return true;
        else
            return false;
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        ChkNum e = new ChkNum();

        if(e.isEven(10))
            System.out.println("10 % 2 == 0");
        if(e.isEven(9))
            System.out.println("9 % 2 == 0");
        if(e.isEven(8))
            System.out.println("8 % 2 == 0");
    }
}
