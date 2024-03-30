enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Transport tp;
        System.out.println("All const Transport: ");

        Transport[] allTransport = Transport.values();
        for(Transport t: allTransport)
            System.out.println(t);
        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp = " + tp);
    }
}
