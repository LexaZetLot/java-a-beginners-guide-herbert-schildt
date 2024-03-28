import java.io.*;

public class Main
{
    public static void main(String[] args)
    {

        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        try(RandomAccessFile raf = new RandomAccessFile("file.dat", "rw")) {
            for (int i = 0; i < data.length; i++)
                raf.writeDouble(data[i]);
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("1: " + d);

            raf.seek(8);
            d = raf.readDouble();
            System.out.println("2: " + d);

            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.println("3: " + d);
            System.out.println();

            System.out.println("% 2 == 0 ");
            for(int i = 0; i < data.length; i += 2){
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch (IOException exc){
            System.out.println("Error input-output: " + exc);
        }
    }
}
