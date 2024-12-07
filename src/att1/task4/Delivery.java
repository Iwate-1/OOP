package att1.task4;

import java.util.ArrayList;

public class Delivery extends Order {

    private String address;

    public Delivery(String customerName, String address, ArrayList<OrderItem> orderedItems, double totalAmount) {
        super(customerName, orderedItems, totalAmount);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String get() {
        return "\nЗаказчик: " + getCustomerName() + ", Адрес: " + getAddress() +
                ", Список продуктов: " + getOrderedItems()  +
                ", Итоговая сумма: " + getTotalAmount();
    }
    @Override
    public String toString() {
        return get();
    }

}
