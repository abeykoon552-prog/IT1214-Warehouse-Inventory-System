import java.util.ArrayList;

public class Inventory {
    // Java Collection (ArrayList)
    private ArrayList<Item> itemsList;

    // Constructor
    public Inventory() {
        itemsList = new ArrayList<>();
    }

    // 1. Add a new item
    public void addItem(Item item) {
        itemsList.add(item);
        System.out.println("Item added successfully.");
    }

    // 2. Remove an item
    public void removeItem(String itemId) {
        boolean removed = itemsList.removeIf(item -> item.getItemId().equalsIgnoreCase(itemId));
        if (removed) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Error: Item not found.");
        }
    }

    // 3. Update item quantity
    public void updateQuantity(String itemId, int newQuantity) {
        for (Item item : itemsList) {
            if (item.getItemId().equalsIgnoreCase(itemId)) {
                item.setQuantity(newQuantity);
                System.out.println("Quantity updated successfully.");
                return;
            }
        }
        System.out.println("Error: Item not found.");
    }

    // 4. Search item by ID or name
    public void searchItem(String keyword) {
        boolean found = false;
        for (Item item : itemsList) {
            if (item.getItemId().equalsIgnoreCase(keyword) || item.getItemName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching items found for: " + keyword);
        }
    }

    // 5. Display all items
    public void displayAllItems() {
        if (itemsList.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\n--- All Items in Inventory ---");
            for (Item item : itemsList) {
                System.out.println(item.toString());
            }
            System.out.println("-----------------------------------");
        }
    }
}