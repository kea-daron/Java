package delivery;
import java.util.ArrayList;
import java.util.List;
class User {
    private int userId;
    private String name;
    private List<Order> orderHistory;

    public User(int userId , String name){
        this.userId=userId;
        this.name=name;
        this.orderHistory= new ArrayList<>();
    }
    public void placeOrder(Order order){
        orderHistory.add(order);
    }
    public List<Order> viewOrderHistory(){
        return orderHistory;
    }
}
