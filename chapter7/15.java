class Sup
{
    void who() {System.out.println("who() to Sup");}
}
class Sub1 extends Sup
{
    void who() {System.out.println("who() to Sub1");}
}
class Sub2 extends Sup
{
    void who() {System.out.println("who() to Sub2");}
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}
