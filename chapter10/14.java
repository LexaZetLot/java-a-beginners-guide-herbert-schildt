import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.println("Read str, stop - end");
        try(FileWriter fw = new FileWriter("test.txt"))
        {
            do{
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0)
                    break;
                str = str + "\r\n";
                fw.write(str);
            }while (str.compareTo("stop") != 0);
        }
        catch (IOException exc){
            System.out.println("Error input-output: " + exc);
        }
    }
}

