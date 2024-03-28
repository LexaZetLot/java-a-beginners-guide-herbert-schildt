import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        int i = 10;
        double d = 1023.56;
        boolean b = true;
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("fileout"))){
            System.out.println("Write " + i);
            dataOut.writeInt(i);

            System.out.println("Write " + d);
            dataOut.writeDouble(d);

            System.out.println("Write " + b);
            dataOut.writeBoolean(b);

            System.out.println("Write " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }
        catch (IOException exc){
            System.out.println("File read error");
            return;
        }
        System.out.println();
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("fileout"))) {
            i = dataIn.readInt();
            System.out.println("Read " + i);

            d = dataIn.readDouble();
            System.out.println("Read " + d);

            b = dataIn.readBoolean();
            System.out.println("Read " + b);

            d = dataIn.readDouble();
            System.out.println("Read " + d);
        }
        catch (IOException exc){
            System.out.println("File read error");
        }
    }
}
