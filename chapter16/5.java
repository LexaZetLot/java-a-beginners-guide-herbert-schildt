public class Main {
    enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT}
    public static void main(String[] args){
        int line1count = 0;
        int line2count = 0;
        int line3count = 0;

        int productionLine;
        for(int i = 1; i < 10; i++)
        {
            productionLine = (i % 3) + 1;
            switch (productionLine) {
                case 1 -> {
                    line1count++;
                    System.out.println("line1count");
                }
                case 2 -> {
                    line2count++;
                    System.out.println("line2count");
                }
                case 3 -> {
                    line3count++;
                    System.out.println("line3count");
                }
            }
        }
        System.out.println("line1count: " + line1count + ", " +
                "line2count: " + line2count + ", " + "line3count: " + line3count);
    }
}
