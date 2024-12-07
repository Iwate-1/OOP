package att1.task4;

public class OrderItem {
    private FoodProduct product; // Продукт
    private int quantity;    // Количество

    public OrderItem(FoodProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Продукт: " + product.getName() + ", Количество: " + quantity;
    }
}

