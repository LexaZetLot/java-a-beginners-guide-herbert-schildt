class Vehicle
{
    int passengers;
    int fuelcap;
    int mpg;
    void range()
    {
        System.out.println("Range: " + fuelcap * mpg);
    }
}


public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Passengers: " + minivan.passengers + "\nFuelcap: " + minivan.fuelcap + "\nMpg: " + minivan.mpg + "\nRange: " + range1);
        minivan.range();
        System.out.println("Passengers: " + sportcar.passengers + "\nFuelcap: " + sportcar.fuelcap + "\nMpg: " + sportcar.mpg + "\nRange: " + range2);
        sportcar.range();
    }
}
