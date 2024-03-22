public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "12345678";

        System.out.print("Original message: ");
        System.out.println(msg);

        for (int i = 0, j = 0; i < msg.length(); i++, j++)
        {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            if(j == key.length() - 1)
                j = 0;
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        for (int i = 0, j = 0; i < msg.length(); i++, j++)
        {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            if(j == key.length() - 1)
                j = 0;
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}

