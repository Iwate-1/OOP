package att2.task5.Classes;

public class Product {
    private String NameOfProduct;
    private int expirationdate;
    private int price;

    public Product(String nameOfProduct, int expirationdate, int price) {
        NameOfProduct = nameOfProduct;
        this.expirationdate = expirationdate;
        this.price = price;
    }

    public String getNameOfProduct() {
        return NameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        NameOfProduct = nameOfProduct;
    }

    public int getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(int expirationdate) {
        this.expirationdate = expirationdate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
