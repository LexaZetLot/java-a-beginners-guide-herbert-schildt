class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        b = base;
        e = exp;

        val = 1;
        if (exp == 0)
            return;
        for ( ; exp > 0; exp--)
            val = val * base;
    }

    double get_pwr() {
        return this.val;
    }
}

public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Pwr x = new Pwr(4.0 ,2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + "^" + x.e + "= " + x.get_pwr());
        System.out.println(y.b + "^" + y.e + "= " + y.get_pwr());
        System.out.println(z.b + "^" + z.e + "= " + z.get_pwr());
    }
}
