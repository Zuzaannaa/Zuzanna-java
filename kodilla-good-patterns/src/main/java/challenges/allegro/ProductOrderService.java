package challenges.allegro;

public class ProductOrderService {
    public boolean sold(PlaceOrder placeOrder) {
        System.out.println("Product sold to: " + placeOrder.getUser()
                + " Time of sale: " + placeOrder.getOrderPlaced()
                + " Product: " + placeOrder.getProductName()
                + " Price: " + placeOrder.getPrice());
        return true;
    }
}






