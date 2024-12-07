package att1.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем список продуктов
        FoodProduct product1 = new FoodProduct("Молочные продукты", "Молоко", 250, 10, "21.02.21", "21.02.24");
        FoodProduct product2 = new FoodProduct("Мясные продукты", "Курица", 300, 5, "21.02.21", "21.02.24");
        FoodProduct product4 = new FoodProduct("Мясные продукты", "Ножки куриные", 300, 5, "21.02.21", "21.02.24");
        FoodProduct product5 = new FoodProduct("Мясные продукты", "Ветчина", 300, 5, "21.02.21", "21.02.24");


        // Создаем список для заказанных продуктов
        ArrayList<OrderItem> orderedItems = new ArrayList<>();

        // Создаем заказ для клиента
        SpecificOrder order1 = new SpecificOrder("Иван Иванович", orderedItems);
        order1.addProduct(product1, 3);
        order1.addProduct(product2, 2);

        // Создаем доставку
        Delivery delivery1 = new Delivery(order1.getCustomerName(), "Улица Пушкина, дом 27", orderedItems, order1.getTotalAmount());

        // Добавляем заказ в доставку
        delivery1.addOrder();


        SpecificOrder order2 = new SpecificOrder("Лидия Васильевна", orderedItems);
        order2.addProduct(product4, 3);
        order2.addProduct(product5, 2);

        Delivery delivery2 = new Delivery(order2.getCustomerName(), "Улица Карла Маркса, дом 17", orderedItems, order1.getTotalAmount());

        // Добавляем заказ в доставку
        delivery2.addOrder();




        // Выводим все заказы
        System.out.println("Все заказы:");
        for (Order order : Order.getAllOrders()) {
            System.out.println(order.get());
        }
    }
}
