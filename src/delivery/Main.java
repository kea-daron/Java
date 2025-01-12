package delivery;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Add menu items
        FoodItem Sandwich = new FoodItem("Sandwich", 22.99F, "Cheese Sandwich", Arrays.asList("Cheese", "Tomato Sauce", "Dough"));
        DrinkItem Coca = new DrinkItem("Coca", 3.99F, "Refreshing beverage", "Large");

        restaurant.addToMenu(Sandwich);
        restaurant.addToMenu(Coca);

        // View menu
        System.out.println("Menu:");
        for (MenuItem item : restaurant.viewMenu()) {
            System.out.println(item.getDetails() + "\n");
        }

        // Create an order
        Order order = new Order();
        order.addItem(Sandwich);
        order.addItem(Coca);

        // Calculate total
        System.out.println("Order Total: $" + order.calculateTotal());

        // Process order
        restaurant.processOrder(order);

        // Create a user and place an order
        User user = new User(1, "John Doe");
        user.placeOrder(order);

        // View order history
        user.viewOrderHistory();
    }
}
