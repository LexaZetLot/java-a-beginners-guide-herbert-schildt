public class Main {
    public static void main(String[] args) {
        double a, b, c, x;

        a = 4;
        b = 1;
        c = -3;

        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("1 sqrt: " + x);

        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("2 sqrt: " + x);
    }
}
