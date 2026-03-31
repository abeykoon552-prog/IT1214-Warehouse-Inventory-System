import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
        
            System.out.println("Warehouse Inventory Management System ");
            System.out.println("1. Add a new item to inventory");
            System.out.println("2. Remove an existing item");
            System.out.println("3. Update item quantity");
            System.out.println("4. Search for an item (by ID or name)");
            System.out.println("5. Display all items in inventory");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter Item ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter Item Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Quantity: ");
                        int quantity = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter Price: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        
                        inventory.addItem(new Item(id, name, quantity, price));
                        break;
                        
                    case 2:
                        System.out.print("Enter Item ID to remove: ");
                        String removeId = scanner.nextLine();
                        inventory.removeItem(removeId);
                        break;
                        
                    case 3:
                        System.out.print("Enter Item ID to update: ");
                        String updateId = scanner.nextLine();
                        System.out.print("Enter new Quantity: ");
                        int newQty = Integer.parseInt(scanner.nextLine());
                        inventory.updateQuantity(updateId, newQty);
                        break;
                        
                    case 4:
                        System.out.print("Enter Item ID or Name to search: ");
                        String searchKey = scanner.nextLine();
                        inventory.searchItem(searchKey);
                        break;
                        
                    case 5:
                        inventory.displayAllItems();
                        break;
                        
                    case 6:
                        running = false;
                        System.out.println("Exiting the system. Goodbye!");
                        break;
                        
                    default:
                        System.out.println("Invalid option! Please select a number between 1 and 6.");
                }
            } catch (NumberFormatException e) {
            
                System.out.println("Invalid input! Please enter correct numbers where expected.");
            }
        }
        
        scanner.close();
    }
}