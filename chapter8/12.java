interface MyIF
{
    int getUserID();
    default int getAdminID()
    {
        return 1;
    }
}
class MyIFImp implements MyIF
{
    public int getUserID()
    {
        return 100;
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        MyIFImp obj = new MyIFImp();

        System.out.println("User ID is " + obj.getUserID());
        System.out.println("Administrator ID is " + obj.getAdminID());
    }
}
