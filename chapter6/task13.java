public class Main
{
     static int myfunc(int ... arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    public static void main(String[] args) throws java.io.IOException
    {
        System.out.println(myfunc(10, 14, 16, 6));
    }
}
