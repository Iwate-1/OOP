package att1.task4;

public class FoodProduct extends Product {
    private String category;

    public FoodProduct( String category, String name, double price, int count, String manufactureDate, String expirationDate) {
        super(name, price, count, manufactureDate, expirationDate);
        this.category = category;
    }

    @Override
    public String get() {
        return  "\nПродукт: " + getName() + "Цена" + getPrice() + ", Количество продукта " + getCount() +
                ", Дата изготовления " + getManufactureDate() +  ", Дата окончания срока годности " + getExpirationDate() ;
    }
    @Override
    public String toString() {
        return get();
    }

}
