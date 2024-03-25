public class Main
{
     static void myfunc(String str, int i)
    {
        if(i < str.length() - 1)
            myfunc(str, i + 1);
        System.out.print(str.charAt(i));
    }
    public static void main(String[] args) throws java.io.IOException
    {
        myfunc("qwerty", 0);
    }

}
