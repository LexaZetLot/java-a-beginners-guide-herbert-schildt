public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        int i;

        for(i = 0; i < 10; i++)
            switch(i)
            {
                case 1:
                    System.out.println("x == 1");
                    break;
                case 2:
                    System.out.println("x == 2");
                    break;
                case 3:
                    System.out.println("x == 3");
                    break;
                case 4:
                    System.out.println("x == 4");
                    break;
                default:
                    System.out.println("!(x <= 4 & x >= 1)");
                    break;
            }
    }
}
