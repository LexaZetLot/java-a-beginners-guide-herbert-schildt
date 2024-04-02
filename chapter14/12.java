interface  MyFunc {
    MyClass func(String s);
}
class MyClass {
    private String str;

    MyClass(String s) {str = s;}
    MyClass() {str = "";}
    String getStr() {return str;}
}
public class Main {
    public static void main(String[] args) {
        MyFunc myClassCons = MyClass::new;
        MyClass mc = myClassCons.func("Test");
        System.out.println("str in mc: " + mc.getStr());
    }
}

