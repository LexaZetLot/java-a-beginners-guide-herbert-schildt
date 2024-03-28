import java.io.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int i;
        args = new String[1];
        FileInputStream fin;
        args[0] = "file.txt";
        if(args.length != 1)
        {
            System.out.println("File name");
            return;
        }
        try
        {
            fin = new FileInputStream(args[0]);
        }
        catch (FileNotFoundException exc)
        {
            System.out.println("File not");
            return;
        }
        try
        {
            do
            {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            }while(i != -1);
        }
        catch (IOException exc)
        {
            System.out.println("File read error");
        }
        finally
        {
            try
            {
                fin.close();
            }
            catch(IOException exc)
            {
                System.out.println("File closing error");
            }
        }

    }
}
