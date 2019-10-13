package challenges.food2door;

public class Product {
    private String productName;
    private double productPrice;
    private int amount;

    public Product(String productName, double productPrice, int amount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getAmount() {
        return amount;
    }
}
