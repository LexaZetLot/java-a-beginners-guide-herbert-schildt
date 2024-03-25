abstract class TwoDShape
{
    private double width;
    private double height;
    private String name;

    TwoDShape()
    {
        width = height = 0.0;
        name = "none";
    }
    TwoDShape(double w, double h, String n)
    {
        width = w;
        height = h;
        name = n;
    }
    TwoDShape(double x, String n)
    {
        width = height = x;
        name = n;
    }
    TwoDShape(TwoDShape ob)
    {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}
    String getName(){return name;}

    void showDim() {System.out.println("width: " + width + "  height: " + height);}
    abstract double area();
}

class Circle extends TwoDShape
{
    Circle()
    {
        super();
    }
    Circle(double w, double h, String n)
    {
        super(w, h, n);
    }
    Circle(double x, String n)
    {
        super(x, n);
    }
    Circle(Circle ob)
    {
        super(ob);
    }
    double area(){ return 2 * 3.14 * getWidth();}
}


public class Main
{
    public static void main(String[] args) throws java.io.IOException
    {
        Circle test = new Circle(10, "none");

        System.out.println(test.area());
    }
}
