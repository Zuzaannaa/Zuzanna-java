package challenges.food2door;

public class OrderRepository {
    public boolean isSold(CreateOrder createOrder){
        System.out.println("Customer: " + createOrder.getBuyer());
        return true;
    }
}
