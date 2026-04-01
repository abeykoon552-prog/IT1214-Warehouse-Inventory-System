import java.util.Scanner;
import java.util.ArrayList;

public class Warehouse {
    public static void main(String[] args) {
        

        ArrayList<Item> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Inventory Entry System ---");

        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEntering details for Item " + (i + 1));
            
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            
            sc.nextLine(); 

            
            Item newItem = new Item(id, name, qty, price);
            list.add(newItem);
        }

        
        System.out.println("\n--- Final Inventory List ---");
        for (Item item : list) {
            System.out.println("ID: " + item.id + " | Name: " + item.name + " | Qty: " + item.qty + " | Price: " + item.price);
        }
    }
}