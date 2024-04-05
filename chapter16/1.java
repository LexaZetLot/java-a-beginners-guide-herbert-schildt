public class Main {
    enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT}
    public static void main(String[] args){
        ShipMethod shipBy;
        int productID = 5099;

        switch (productID) {
            case 1774:
            case 8709:
            case 6709:
                shipBy = ShipMethod.TRUCK;
                break;
            case 4657:
            case 2195:
            case 3621:
            case 1887:
                shipBy = ShipMethod.AIR;
                break;
            case 2907:
            case 5099:
                shipBy = ShipMethod.OVERNIGHT;
                break;
            default:
                shipBy = ShipMethod.STANDARD;
        }
        System.out.println(productID + ": " + shipBy);
    }
}

