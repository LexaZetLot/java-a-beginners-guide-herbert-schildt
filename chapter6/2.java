class FailSoftArray
{
    private  int[] a;
    private  int errval;
    public  int lenght;
    public FailSoftArray(int size, int errv)
    {
        a = new int[size];
        errval = errv;
        lenght = size;
    }
    public int get(int index)
    {
        if(indexOK(index))
            return a[index];
        return errval;
    }
    public boolean put(int index, int val)
    {
        if(indexOK(index))
        {
            a[index] = val;
            return true;
        }
        return false;
    }
    private  boolean indexOK(int index)
    {
        if(index >= 0 & index < lenght)
            return true;
        return false;
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        FailSoftArray fs =new FailSoftArray(5, -1);
        int x;

        System.out.println("Fail quietly.");
        for(int i = 0; i < (fs.lenght * 2); i++)
            fs.put(i, i * 10);

        for(int i = 0; i < (fs.lenght * 2); i++)
        {
            x = fs.get(i);
            if(x != -1)
                System.out.print(x + " ");
        }
        System.out.println("");

        System.out.println("\nFail with error reports.");
        for(int i = 0; i < (fs.lenght * 2); i++)
            if(!fs.put(i, i * 10))
                System.out.println("Index " + i + " out-of-bounds");
        for(int i = 0; i < (fs.lenght * 2); i++)
        {
            x = fs.get(i);
            if(x != -1)
                System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");
        }
    }
}

