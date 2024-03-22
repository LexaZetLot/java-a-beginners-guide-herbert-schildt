class MyClass
{
    private  int alpha;
    public  int beta;
    int gamma;

    void setAlpha(int a)
    {
        alpha = a;
    }
    int getAlpha()
    {
        return alpha;
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        MyClass ob = new MyClass();
        ob.beta = 88;
        ob.gamma = 99;
    }
}

