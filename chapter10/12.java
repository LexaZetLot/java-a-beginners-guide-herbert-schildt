import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        String str;

        System.out.println("Read string.");
        System.out.println("close in read stop.");
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
