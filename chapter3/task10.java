public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int num = 0;
        char ch = 0;
        while((ch = (char)System.in.read()) != '.')
        {
            if(ch >= 'a' | ch <= 'z')
            {
                num++;
                ch -= 32;
                System.out.print(ch);
            }
            else if(ch >= 'A' | ch <= 'Z')
            {
                num++;
                ch += 32;
                System.out.print(ch);
            }
        }
        System.out.print("\n" + num);
    }
}
