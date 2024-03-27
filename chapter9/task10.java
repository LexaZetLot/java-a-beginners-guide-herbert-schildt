class SatckErrorPop extends Exception
{
    public String toString()
    {
        return "Stack in full";
    }
}
class SatckErrorPush extends Exception
{
    public String toString()
    {
        return "Stack in full";
    }
}

class Stack
{
    private char[] arr_ch;
    private int point;


    Stack(int s) {

        arr_ch = new char[s];
        point = 0;
        for (int i = 0; i < arr_ch.length; i++)
            arr_ch[i] = '\0';
    }

    char pop() throws SatckErrorPop
    {
        if (point >= 0)
            return arr_ch[--point];
        else
            throw new SatckErrorPop();
    }

    void push(char ch) throws SatckErrorPush
    {
        if ((point >= 0) && (point < arr_ch.length))
        {
            arr_ch[point] = ch;
            if(point == arr_ch.length - 1)
                throw new SatckErrorPush();
            else
                point++;
        }
        else
            throw new SatckErrorPush();
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Stack test = new Stack(10);
        try
        {
            for (char i = 'a'; i < 'a' + 10; i++)
                test.push(i);
            for (int i = 0; i < 11; i++)
                System.out.println(test.pop());
        }
        catch (SatckErrorPop | SatckErrorPush exc)
        {
            System.out.println(exc);
        }

    }
}
