public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        String orgstr = "Java makes the Web move.";

        String substr = orgstr.substring(5, 24);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
