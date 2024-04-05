public class Main {
    enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT}
    record ShippingInfo (ShipMethod how, boolean extraCharge) {}
    public static void main(String[] args){
        int productID = 5099;
        boolean extraCharge;

        ShippingInfo ch = switch (productID) {
            case 1774, 8709, 6709 -> new ShippingInfo(ShipMethod.TRUCK, true);
            case 4657, 2195, 3621, 1887 -> new ShippingInfo(ShipMethod.AIR, false);
            case 2907, 5099 -> new ShippingInfo(ShipMethod.OVERNIGHT, true);
            default -> new ShippingInfo(ShipMethod.STANDARD, false);
        };
        System.out.println(productID + ": " + ch.how());
        if(ch.extraCharge())
            System.out.println("Additional payment required");
    }
}
