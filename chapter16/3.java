public class Main {
    enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT}
    public static void main(String[] args){
        int productID = 5099;

        ShipMethod shipBy = switch (productID) {
            case 1774, 8709, 6709 -> ShipMethod.TRUCK;
            case 4657, 2195, 3621, 1887 -> ShipMethod.AIR;
            case 2907, 5099 -> ShipMethod.OVERNIGHT;
            default -> ShipMethod.STANDARD;
        };
        System.out.println(productID + ": " + shipBy);
    }
}
