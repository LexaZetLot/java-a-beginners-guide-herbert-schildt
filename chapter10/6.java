import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int i;
        args = new String[1];
        args[0] = "filein.txt";

        if(args.length != 1)
        {
            System.out.println("file-in");
            return;
        }
        try(FileInputStream fin = new FileInputStream(args[0])){
            do{
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            }while(i != -1);
        }
        catch (IOException exc)
        {
            System.out.println("Error input-output: " + exc);
        }
    }
}
