import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> list = new ArrayList<>();

    
    public void addItem(Item item) {
        list.add(item);
        System.out.println("Item Added!");
    }

    
    public void showAll() {
        System.out.println("\n--- Warehouse Stock ---");
        for (Item i : list) {
            System.out.println(i.toString());
        }
    }
}