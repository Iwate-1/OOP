package att2.task5.Classes;

import java.time.LocalDate;
import java.util.List;

public class Delivery {
    private List<Product> orderList;
    private LocalDate dateOfDelivery;
    private double sumCost;

    public Delivery(List<Product> orderList, LocalDate dateOfDelivery) {
        this.orderList = orderList;
        this.dateOfDelivery = dateOfDelivery;

        for(Product p : orderList){
            this.sumCost += p.getPrice();
        }
        this.sumCost *= 1.05;
    }

    public List<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Product> orderList) {
        this.orderList = orderList;
    }

    public LocalDate getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(LocalDate dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public void setSumCost(int sumCost) {
        this.sumCost = sumCost;
    }
}
