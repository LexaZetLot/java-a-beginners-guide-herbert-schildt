class Block
{
    int a, b, c;
    int volume;

    Block(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    boolean sameBlock(Block ob)
    {
        if((ob.a == a) & (ob.b == b) &(ob.c == c))
            return true;
        else
            return false;
    }
    boolean sameVolume(Block ob)
    {
        if(ob.volume == volume)
            return true;
        else
            return false;
    }
}
public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 = ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 = ob3: " + ob1.sameBlock(ob3));
        System.out.println("Vob1 = Vob3: " + ob1.sameVolume(ob3));
    }
}
