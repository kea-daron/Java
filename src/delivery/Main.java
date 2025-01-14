package delivery;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        restaurant.addToMenu(new FoodItem("Pizza", 22.93f, "Cheese pizza", List.of(new String[]{"Cheese", "Tomato Sauce", "Dough"})));
        restaurant.addToMenu(new FoodItem("Burger", 13.29f, "Beef burger", List.of(new String[]{"Beef", "Cheese", "Bun"})));
        restaurant.addToMenu(new DrinkItem("Cola", 4.69f, "Refreshing cola", "Medium"));
        restaurant.addToMenu(new DrinkItem("Lemonade", 21.39f, "Refreshing lemonade", "Large"));
        Order orders = new Order();
        boolean running = true;
        User user =new User(1,"Ron");
        while (running) {
            System.out.println("\n===> Food Delivery System <===");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. View Order Details");
            System.out.println("4. View Order History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Menu ---");
                    List<MenuItem> menuItems = restaurant.viewMenu();
                    for (MenuItem item : menuItems) {
                        System.out.println(item.getDetails());
                    }
                    break;
                case 2:
                    System.out.println("\nEnter the name of the item to add to your order:");
                    String itemName = scanner.nextLine();
                    boolean found = false;
                    for (MenuItem item : restaurant.viewMenu()) {
                        if (item.name.equalsIgnoreCase(itemName)) {
                            orders.addItem(item);
                            found = true;
                            System.out.println(item.name + " added to your order.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found in the menu.");
                    }
                    break;
                case 3:
                    if (orders.getItems().isEmpty()) {
                        System.out.println("\nYour order is currently empty.");
                    } else {
                        System.out.println("\n--- Order Details ---");
                        for (MenuItem item : orders.getItems()) {
                            System.out.println(item.getDetails());
                        }
                        user.placeOrder(orders);
                    }
                    break;
                case 4 :
                    if (user.viewOrderHistory()==null || user.viewOrderHistory().isEmpty()) {
                        System.out.println("\nNo past orders available.");
                    } else {
                        System.out.println("\n--- Order History ---");
                        for (Order order : user.viewOrderHistory()) {
                            System.out.println(order.getDetails());
                            System.out.println("------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}

