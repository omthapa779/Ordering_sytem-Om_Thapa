package Model;
import java.util.List;

public class Order {
    public List<Items> items;
    private double Total;
    public Order(List<Items> items){
        this.items = items;
        this.Total = CalculateTotal();
    }

    private double CalculateTotal(){
        double Total = 0.0;
        for (Items item : items){
            Total += item.price;
        }
        return Total;
    }

    public double getInvoice(){
        return Total;
    }
}
