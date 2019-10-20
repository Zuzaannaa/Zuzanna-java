package challenges.food2door;

public class InformationService {
    public boolean inform(CreateOrder createOrder) {
        System.out.println("Buyer: " + createOrder.getBuyer());
        return true;
    }
}
