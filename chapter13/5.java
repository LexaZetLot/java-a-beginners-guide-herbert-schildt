class A{}
class B extends A {}
class C extends A {}
class D {}
class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
}
public class Main {
    static void test(Gen<? extends A> o)
    {}
    public static void main(String[] args) throws java.io.IOException {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        Gen<A> w1 = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);

        test(w1);
        test(w2);
        test(w3);
    }
}
