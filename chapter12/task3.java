enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        for(Tools t : Tools.values())
            System.out.println(t  + " " + t.ordinal());
    }
}
