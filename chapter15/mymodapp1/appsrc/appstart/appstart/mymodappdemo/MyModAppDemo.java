package appstart.mymodappdemo;
import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
public class MyModAppDemo {
    public static void main(String[] args)
    {
        if(SupportFuncs.isFactor(2, 10))
            System.out.println("10 % 2 == 0");
        System.out.println("Smallest divisor 35 and 105 = " + SimpleMathFuncs.islcf(35, 105));
        System.out.println("Greatest divisor 35 and 105 = " + SimpleMathFuncs.isgcf(35, 105));
    }
}
