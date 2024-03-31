@Deprecated class MyClass{
    private String msg;
    MyClass(String m){
        msg = m;
    }
@Deprecated String getMsg(){
        return msg;
}
}

public class Main {
    public static void main(String[] args) {
        MyClass myObj = new MyClass("test");
        System.out.println(myObj.getMsg());
    }
}
