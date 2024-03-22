class Summation
{
int sum;

// Construct from an int.
Summation(int num) {
    sum = 0;
    for (int i = 1; i <= num; i++)
        sum += i;
}

// Construct from another object.
Summation(Summation ob) {
    sum = ob.sum;
}
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
