package challenges.allegro;

public class InformationService {
    public boolean inform(PlaceOrder placeOrder) {
        System.out.println("Buyer: " + placeOrder.getUser());
        return true;
    }

}
