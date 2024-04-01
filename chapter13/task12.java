interface IGenStack<T> {
    T pop() throws SatckErrorPop;
    void push (T ob) throws SatckErrorPush;
}
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

class Stack<T> implements IGenStack<T>{
    T[] arr_ch;
    private int point;


    Stack(T[] s) {
        arr_ch = s;
        point = 0;

    }

    public T pop() throws SatckErrorPop {
        if (point > 0)
            return arr_ch[--point];
        else
            throw new SatckErrorPop();
    }

    public void push(T ch) throws SatckErrorPush
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
        Character[] ch = new Character[10];
        Stack test = new Stack(ch);
        try
        {
            for (char i = 'a'; i < 'a' + 9; i++)
                test.push(i);
            for (int i = 0; i < 9; i++)
                System.out.println((char)test.pop());
        }
        catch (SatckErrorPop | SatckErrorPush exc)
        {
            System.out.println(exc);
        }

    }
}

