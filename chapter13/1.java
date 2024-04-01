class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("T: " + ob.getClass().getName());
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Testing generalizations");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
}
