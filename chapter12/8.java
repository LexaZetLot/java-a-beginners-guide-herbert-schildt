public class Main {
    public static void main(String[] args) {
        Integer iOb1, iOb2;
        int i;

        iOb1 = 99;
        System.out.println("iOb1: " + iOb1);

        ++iOb1;
        System.out.println("iOb1: " + iOb1);

        iOb1 += 10;
        System.out.println("iOb1: " + iOb1);

        iOb2 = iOb1 + (iOb1 / 3);
        System.out.println("iOb2: " + iOb2);

        i = iOb1 + (iOb1 / 3);
        System.out.println("i: " + i);
    }
}
