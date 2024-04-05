public class Main {
    enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT}
    public static void main(String[] args){
        int productID = 5099;
        boolean extraCharge;

        ShipMethod shipBy = switch (productID) {
            case 1774, 8709, 6709 -> {
                extraCharge = true;
                yield ShipMethod.TRUCK;
            }
            case 4657, 2195, 3621, 1887 -> {
                extraCharge = false;
                yield ShipMethod.AIR;
            }
            case 2907, 5099 -> {
                extraCharge = true;
                yield ShipMethod.OVERNIGHT;
            }
            default -> {
                extraCharge = false;
                yield ShipMethod.STANDARD;
            }
        };
        System.out.println(productID + ": " + shipBy);
        if(extraCharge)
            System.out.println("Additional payment required");
    }
}
