import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        args = new String[2];
        args[0] = "filein.txt";
        args[1] = "fileout.txt";

        if(args.length != 2)
        {
            System.out.println("file-in file-out");
            return;
        }
        try(FileReader fin = new FileReader(args[0]);
            FileWriter fout = new FileWriter(args[1])){
            while ((ch = fin.read()) != -1){
                if (ch == ' ')
                    ch = '-';
                fout.write((char) ch);
            }
        }
        catch (IOException exc) {
            System.out.println(exc);
        }
    }
}
