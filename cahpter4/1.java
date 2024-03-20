class Vehicle
{
    int passengers;
    int fuelcap;
    int mpg;
}


public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.print("Passengers: " + minivan.passengers + "\nFuelcap: " + minivan.fuelcap + "\nMpg: " + minivan.mpg);
    }
}
