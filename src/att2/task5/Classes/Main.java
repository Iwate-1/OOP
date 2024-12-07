package att2.task5.Classes;

import att2.task5.Exception.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Product potato = new Product("Картошка", 30, 125);
        Product cutlet = new Product("Котлеты", 10, 200);
        Product compote = new Product("Компот", 14, 100);
        List<Product> orderList = Arrays.asList(potato, cutlet, compote);
        Delivery delivery = new Delivery(orderList, LocalDate.of(2023, 11, 25));

        Product table = new Product("Стол", 5000, 10000);
        Product chair = new Product(null, 5000, 2000);
        List<Product> newOrderList = Arrays.asList(table, chair);

        try {
            Technicalsupport.setOrderList(newOrderList, delivery);
        } catch (DeliveryException e) {
            System.out.println(e.getMessage());
        }

        try {
            Technicalsupport.checkDeliveryParam(delivery);
        }catch (DeliverySecondException e){
            System.out.println(e.getMessage());
        }

    }
}
