class Gen<T extends Number>{
    T ob;
    T[] vals;
    Gen(T o, T[] nums){
        ob = o;
        // vals = new T[10];
        vals = nums;
    }
}
public class Main {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen<Integer> iOb = new Gen<Integer>(50, n);
        //Gen<Integer>[] gens = new Gen<Integer>[10];
        Gen<?>[] gens = new Gen<?>[10];
    }
}
