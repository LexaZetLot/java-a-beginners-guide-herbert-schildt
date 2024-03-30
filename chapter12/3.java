enum Transport {
    CAR(100), TRUCK(90), AIRPLANE(950), TRAIN(110), BOAT(35);
    private int speed;
    Transport(int s) {speed = s;}
    int getSped(){return speed;}
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Transport tp;
        System.out.println("Speed airplane: " + Transport.AIRPLANE.getSped() + "km/h\n");

        System.out.println("Speed all transport: ");
        for(Transport t: Transport.values())
            System.out.println("Speed " + t + " = " + t.getSped() + "km/h");

    }
}
