package challenges.food2door;

public class ProductOrderService {
    public boolean orderPlaced(CreateOrder createOrder, ProducersMap producersMap){
        System.out.println("Customer name: " + createOrder.getBuyer() +
                "Order placed: " + createOrder.getOrderCreated() +
                producersMap.getOffer());
        return true;

    }
}
