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

    char pop()
    {
        if (point >= 0)
            return arr_ch[--point];
        else
            System.out.println("Stack in full");
        return '\0';
    }

    void push(char ch)
    {
        if ((point >= 0) && (point < arr_ch.length))
        {
            arr_ch[point] = ch;
            if(point == arr_ch.length)
                System.out.println("Stack in full");
            else
                point++;
        }
        else
            System.out.println("Stack in full");
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Stack test = new Stack(10);

        for(char i = 'a'; i < 'a' + 10; i++)
            test.push(i);
        for (int i = 0; i < 10; i++)
            System.out.println(test.pop());
    }
}
