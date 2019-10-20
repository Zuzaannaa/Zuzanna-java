package challenges.allegro;

public class OrderRepository {
    public boolean createOrder(PlaceOrder placeOrder) {
        System.out.println("Sending to: " + placeOrder.getUser());
        return true;
    }
}
