enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Transport tp;
        tp = Transport.AIRPLANE;

        System.out.println("Tp: " + tp);
        System.out.println();
        tp = Transport.TRAIN;

        if(tp == Transport.TRAIN)
            System.out.println("tp.TRAIN\n");

        switch (tp){
            case CAR:
                System.out.println("CAR");
                break;
            case TRUCK:
                System.out.println("TRUCK");
                break;
            case AIRPLANE:
                System.out.println("AIRPLANE");
                break;
            case TRAIN:
                System.out.println("TRAIN");
                break;
            case BOAT:
                System.out.println("BOAT");
                break;
        }
    }
}
