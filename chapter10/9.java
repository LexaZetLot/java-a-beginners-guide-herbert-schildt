import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        int i = 0, j = 0;
        args = new String[2];
        args[0] = "filein.txt";
        args[1] = "fileout.txt";

        if(args.length != 2) {
            System.out.println("file-in file-out");
            return;
        }
        try(FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1])) {
            do{
                i = f1.read();
                j = f2.read();
                if(i != j | ((i + 32) != j) | ((j + 32) != i))
                    break;
            }while (i != -1 && j != -1);
            if(i != j)
                System.out.println("The files are different." + i + " " + " "+ j);
            else
                System.out.println("The files are the same.");
        }
        catch (IOException exc){
            System.out.println("Error input-output: " + exc);
        }
    }
}

