interface StringTest {
    boolean test(String aStr, String bStr);
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "This is a tets";
        System.out.println("Str: " + str);
        if(isIn.test(str, "is a"))
            System.out.println("String 'is a' found");
        else
            System.out.println("String 'is a' not found");

        if(isIn.test(str, "xyz"))
            System.out.println("String 'xyz' found");
        else
            System.out.println("String 'xyz' not found");
    }
}

