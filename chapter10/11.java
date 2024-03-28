import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        char c;

        BufferedReader br = new
                BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        System.out.println("Enter a character or a dot.");
        do{
            c = (char) br.read();
            System.out.println(c);
        }while (c != '.');
    }
}

