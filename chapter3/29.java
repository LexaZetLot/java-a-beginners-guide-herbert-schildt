public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
outerloop:
        for(int i = 1; i < 10; i++)
        {
            System.out.print("\ni: " + i + " j: ");
            for(int j = 1; j < 10; j++)
            {
                if(j == 5)
                    continue outerloop;
                System.out.print(j);
            }
        }
    }
}
