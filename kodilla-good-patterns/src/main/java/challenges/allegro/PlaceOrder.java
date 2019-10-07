package challenges.allegro;

import java.time.LocalDate;

public class PlaceOrder {
    private User user;
    private LocalDate orderPlaced;
    private String productName;
    private double price;

    public PlaceOrder(User user, LocalDate orderPlaced, String productName, double price) {
        this.user = user;
        this.orderPlaced = orderPlaced;
        this.productName = productName;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderPlaced() {
        return orderPlaced;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "user=" + user +
                ", orderPlaced=" + orderPlaced +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
