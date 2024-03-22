class Test
{
    void noChage(int i, int j)
    {
        i = i + j;
        j = - j;
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a and b: " + a + " " + b);
        ob.noChage(a, b);
        System.out.println("a and b: " + a + " " + b);
    }
}
