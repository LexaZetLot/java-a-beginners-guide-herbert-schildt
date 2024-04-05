record Item(String name, int itemNum, double price){}
public class Main {
    public static void main(String[] args){
        Item[] items = new Item[4];

        items[0] = new Item("Hammer", 257, 10.99);
        items[1] = new Item("Wrench", 18, 19.29);
        items[2] = new Item("Drill", 903, 22.25);
        items[3] = new Item("Saw", 27, 34.59);

        for(Item myItem: items)
            System.out.println(myItem.name() + "; itemNum: " + myItem.itemNum() + "; Price: " + myItem.price());
    }
}
