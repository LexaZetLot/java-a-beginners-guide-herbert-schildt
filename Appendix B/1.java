 import java.io.*;

/**
 * @author Herbert Schildt
 * @version 1.2
 */

class SquareNum {
    /**
     * @param num squared value
     * @return squared value num
     */
    public double square (double num){
        return num * num;
    }
    /**
     * @return double
     * @throws IOException error
     * @see IOException
     */
    public double getNumber() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;

        str = inData.readLine();
        Double d =  Double.parseDouble(str);
        return d.doubleValue();
    }
}
public class Main {
    /**
     * @param args unused
     * @throws IOException error
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum ob = new SquareNum();
        double val;

        System.out.println("Value for squaring: ");
        val = ob.getNumber();
        val = ob.square(val);

        System.out.println("Result: " + val);
    }
}
