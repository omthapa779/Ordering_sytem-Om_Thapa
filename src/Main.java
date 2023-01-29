import Model.Order;
import Model.Items;
import Model.Orders;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Items> items = new ArrayList<>();
        items.add(new Items("Burgers",120));
        items.add(new Items("Sandwich",110));
        items.add(new Items("Chowmein",100));
        Order Order = new Order(items);
        List<Order> order = new ArrayList<>();
        order.add(Order);
        Orders Customer = new Orders(order);
        
        for (Items Items : Order.items){
            System.out.println("Item Name: " + Items.name);
            System.out.println("Price: " + Items.price);
        }
        System.out.println("---------------------------------");
        System.out.println("Total Price: " + Order.getInvoice());
    }
}