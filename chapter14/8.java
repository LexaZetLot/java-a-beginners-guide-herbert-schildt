import java.io.*;
interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
public class Main {
    public static void main(String[] args) {
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();
            return true;
        };
    }
}

