package att1.task4;

import java.util.ArrayList;

public class SpecificOrder extends Order {

    public SpecificOrder(String customerName, ArrayList<OrderItem> orderedItems) {
        super(customerName, orderedItems, 0); // Изначально 0, итоговую сумму будем считать в методе addProduct
    }

    @Override
    public String get() {
        return null;
    }
}
