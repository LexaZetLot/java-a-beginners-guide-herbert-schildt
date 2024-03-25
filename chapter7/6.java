class A
{
    int i;
}
class B extends A
{
    int i;
    B(int a, int b)
    {
        super.i = a;
        i = b;
    }
    void show()
    {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        B subOb = new B(1, 2);
        subOb.show();
    }
}
