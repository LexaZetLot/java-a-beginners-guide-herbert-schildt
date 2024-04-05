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
record Item(String name, int itemNum, double price){
    static double pricePending = -1;
    public Item(String name, int itemNum, String price) {
        this(name, itemNum, Double.parseDouble(price));
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Item[] buf = new Item[5];
        Item[] items = new Item[4];
        items[0] = new Item("Hammer", 257, 10.99);
        items[1] = new Item("Wrench", 18, 19.29);
        items[2] = new Item("Drill", 903, "22.25");
        items[3] = new Item("Saw", 27, "34.59");

        Stack<Item> test = new Stack(buf);

        try
        {
            for (Item ch: items)
                test.push(ch);
            Item ch;
            for (int i = 0; i < 4; i++) {
                ch = test.pop();
                System.out.println(ch.name() + "; itemNum: " + ch.itemNum() + "; Price: " + ch.price());
            }
        }
        catch (SatckErrorPop | SatckErrorPush exc)
        {
            System.out.println(exc);
        }

    }
}
