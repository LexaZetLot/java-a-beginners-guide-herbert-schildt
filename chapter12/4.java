enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Transport tp1, tp2, tp3;

        for(Transport t: Transport.values())
            System.out.println(t + " " + t.ordinal());

        tp1 = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;
        System.out.println();

        if(tp1.compareTo(tp2) < 0)
            System.out.println(tp1 + " is in front of " + tp2);
        if(tp1.compareTo(tp2) > 0)
            System.out.println(tp2 + " is in front of " + tp1);
        if(tp1.compareTo(tp3) == 0)
            System.out.println(tp1 + " = " + tp3);
    }
}
