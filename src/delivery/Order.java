package delivery;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

class Order {
    @Getter
    private static int ordercount=0;
    private int orderId ;
    private List<MenuItem> items;
    private String status;

    public Order(){
        ordercount++;
        this.orderId=ordercount;
        this.items=new ArrayList<>();
        this.status="Pending";
    }
    public void addItem(MenuItem menu_item){
        items.add(menu_item);
    }
    public void removeItem(MenuItem menu_item){
        items.remove(menu_item);
    }
    public double calculateTotal(){
        double total = 0;
        for (MenuItem item : items) {
            total += item.price;
        }
        return total;
    }
    public void updateStatus(String new_status){
        this.status=new_status;
    }
    public MenuItem getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            return null;
        }
    }
    public List<MenuItem> getItems() {
        return items;
    }
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Items:\n");
        for (MenuItem item : items) {
            details.append(item.getDetails()).append("\n");
        }
        details.append("Status: ").append(status);
        return details.toString();
    }
}

