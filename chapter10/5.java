import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        args = new String[2];
        args[0] = "filein.txt";
        args[1] = "fileout.txt";

        if(args.length != 2)
        {
            System.out.println("file-in file-out");
            return;
        }
        try{
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do{
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            }while (i != -1);
        }
        catch (IOException exc){
            System.out.println("Error input-output: " + exc);
        }
        finally {
            try {
                if (fout != null)
                    fout.close();
            } catch (IOException exc) {
                System.out.println("Error close file.");
            }

        }
    }
}
