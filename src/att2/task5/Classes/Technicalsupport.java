package att2.task5.Classes;


import att2.task5.Exception.DeliveryException;
import att2.task5.Exception.DeliverySecondException;

import java.time.LocalDate;
import java.util.List;

public class Technicalsupport {

    private static int dayToDelivery(LocalDate deliveryDate) {
        return deliveryDate.getYear() * 365 + deliveryDate.getDayOfYear() -
                LocalDate.now().getYear() * 365 - LocalDate.now().getDayOfYear();

    }

    private static void isValidDate(LocalDate deliveryDate) {
        if (dayToDelivery(deliveryDate) <= 1) throw new
                DeliveryException("Нельзя изменить параметры доставки менее чем за день до ее получения или заказ уже получен");
    }

    public static void setOrderList(List<Product> newOrderList, Delivery delivery) {
        isValidDate(delivery.getDateOfDelivery());
        delivery.setOrderList(newOrderList);
    }

    public static void setDeliveryDate(LocalDate newDeliveryDate, Delivery delivery) {
        isValidDate(delivery.getDateOfDelivery());
        delivery.setDateOfDelivery(newDeliveryDate);
    }

    public static void checkDeliveryParam(Delivery delivery) throws DeliverySecondException {
        for (Product p : delivery.getOrderList()) {
            if (p.getNameOfProduct() == null || p.getNameOfProduct() == "" ||
                    p.getExpirationdate() <= 0 || p.getPrice() <= 0)
                throw new DeliverySecondException("Ошибка в данных товара " + p.getNameOfProduct());
        }
        if (dayToDelivery(delivery.getDateOfDelivery()) <= 0)
            throw new DeliverySecondException("Ошибка даты доставки");
    }
}
