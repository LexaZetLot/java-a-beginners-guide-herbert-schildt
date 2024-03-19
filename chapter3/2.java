public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        char ch, answer = 'K';
        System.out.println("press the key: to A-Z");
        System.out.print("press: ");
        ch = (char) System.in.read();
        if(ch == answer)
            System.out.println("WIN");
    }
}
