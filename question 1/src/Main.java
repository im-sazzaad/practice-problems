import java.lang.reflect.Array;
import java.util.ArrayList;

class Order{
    int order_id;
    String order_date;
    float total_amount;
    public Order(int id, String date, float amount){
        this.order_id=id;
        this.order_date=date;
        this.total_amount=amount;
    }
    public String get_order_details(){
        return "Order ID: "+order_id+"\nOrder date: "+order_date+"\nTotal amount: "+total_amount;
    }
}
class PhysicalOrder extends Order{
    String shipping_address;
    public PhysicalOrder(int order_id, String order_date, float total_amount, String shipping_address) {
        super(order_id, order_date, total_amount);
        this.shipping_address = shipping_address;
    }
   @Override
   public String get_order_details(){
        return super.get_order_details()+"\nshipping address: "+shipping_address;
    }
}
class DigitalOrder extends Order{
    ArrayList<String> downloadable_items;
    public DigitalOrder(int order_id, String order_date, float total_amount, ArrayList<String> downloadable_items){
        super(order_id, order_date, total_amount);
        this.downloadable_items=downloadable_items;
    }
    @Override
   public String get_order_details(){
        StringBuilder details = new StringBuilder(super.get_order_details());
        details.append("\nDownloadable items: ");
        for(String item: downloadable_items){
            details.append("\n-").append(item);
        }
        return details.toString();
    }
}

public class Main {
    public static void main(String[] args){
    PhysicalOrder order= new PhysicalOrder(101,"27-02-2023",2600,"Ati bazar");
        System.out.println("Physical order details: ");
        System.out.println(order.get_order_details());
        ArrayList<String> items= new ArrayList<>();
        items.add("book");
        items.add("book2");
        DigitalOrder order1 = new DigitalOrder(102,"28-02-2023",2700,items);
        System.out.printf("Digital order list: ");
        System.out.println(order1.get_order_details());
    }
}