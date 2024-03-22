class MyClass
{
    int x;
    MyClass()
    {
        System.out.println("MyClass()");
        x = 0;
    }
    MyClass(int i)
    {
        System.out.println("MyClass(int)");
        x = i;
    }
    MyClass(double b)
    {
        System.out.println("MyClass(double)");
        x = (int) b;
    }
    MyClass(int i, int j)
    {
        System.out.println("MyClass(int, int)");
        x = i * j;
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
