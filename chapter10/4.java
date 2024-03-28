import java.io.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int i;
        args = new String[1];
        args[0] = "file";
        FileInputStream fin = null;

        if(args.length != 1)
        {
            System.out.println("File name");
            return;
        }
        try
        {
            fin = new FileInputStream(args[0]);
            do
            {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            }while(i != -1);
        }
        catch (FileNotFoundException exc)
        {
            System.out.println("File not");
            return;
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

