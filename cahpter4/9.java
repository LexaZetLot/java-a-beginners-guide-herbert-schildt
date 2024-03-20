class MyClass
{
    int x;

    MyClass()
    {
        x = 10;
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}
