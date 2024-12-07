package att1.task4;


public abstract class Product implements Orders {
    private String name;          // Название продукта
    private double price;         // Цена продукта
    private int count;            // Количество продукта
    private String manufactureDate; // Дата изготовления
    private String expirationDate;  // Дата окончания срока годности

    // Конструктор
    public Product(String name, double price, int count, String manufactureDate, String expirationDate) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.manufactureDate = manufactureDate;
        this.expirationDate = expirationDate;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

