package challenges.allegro;

public class InformationService {
    public boolean inform(PlaceOrder placeOrder) {
        System.out.println("Product sold to:" + placeOrder.getUser());
        return true;
    }

}
