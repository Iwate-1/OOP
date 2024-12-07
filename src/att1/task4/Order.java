package att1.task4;

import java.util.ArrayList;

public abstract class Order implements Orders {

    private String customerName;
    private ArrayList<OrderItem> orderedItems;
    private double totalAmount;

    private static ArrayList<Order> allOrders = new ArrayList<>();

    public Order(String customerName, ArrayList<OrderItem> orderedItems, double totalAmount) {
        this.customerName = customerName;
        this.orderedItems = orderedItems;
        this.totalAmount = totalAmount;
    }

    public void addOrder() {
        allOrders.add(this);
    }

    public void addProduct(FoodProduct product, int quantity) {
        if (quantity <= product.getCount()) {
            orderedItems.add(new OrderItem(product, quantity));
            totalAmount += product.getPrice() * quantity;
        } else {
            System.out.println("Недостаточное количество продукта: " + product.getName());
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public static ArrayList<Order> getAllOrders() {
        return allOrders;
    }

    public ArrayList<OrderItem> getOrderedItems() {
        return orderedItems;
    }
}