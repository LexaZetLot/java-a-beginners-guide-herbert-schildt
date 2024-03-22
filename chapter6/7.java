class ErrorMsg {
    String[] msgs = {
            "Output Error",
            "InputError",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    // Return the error message.
    String getErrorMsg(int i) {
        if (i >= 0 && i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
