public class Item {
    public String id;
    public String name;
    public int qty;
    public double price;

    
    public Item(String id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Qty: " + qty + " | Price: " + price;
    }
}