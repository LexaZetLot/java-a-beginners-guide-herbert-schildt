package appstart.mymodappdemo;

import java.util.ServiceLoader;
import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
import userfuncs.binaryfuncs.*;

public class MyModAppDemo {
    public static void main(String[] args)
    {
        if(SupportFuncs.isFactor(2, 10))
            System.out.println("10 % 2 == 0");
        System.out.println("Smallest divisor 35 and 105 = " + SimpleMathFuncs.islcf(35, 105));
        System.out.println("Greatest divisor 35 and 105 = " + SimpleMathFuncs.isgcf(35, 105));

        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);
        BinaryFunc binOp = null;
        for(BinFuncProvider bfp : ldr) {
            if(bfp.get().getName().equals("absPlus")) {
                binOp = bfp.get();
                break;
            }
        }
        if(binOp != null)
            System.out.println("absPlus: " + binOp.func(12, -4));
        else
            System.out.println("absPlus not");

        binOp = null;
        for(BinFuncProvider bfp: ldr) {
            if(bfp.get().getName().equals("absMinus")) {
                binOp = bfp.get();
                break;
            }
        }
        if(binOp != null)
            System.out.println("absMinus: " + binOp.func(12, -4));
        else
            System.out.println("absMinus not");
    }
}
