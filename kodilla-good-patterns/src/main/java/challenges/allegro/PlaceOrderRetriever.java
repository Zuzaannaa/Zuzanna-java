package challenges.allegro;

import java.time.LocalDate;

public class PlaceOrderRetriever {
    public PlaceOrder retrieve(){
        User user = new User("Joe", "Lubben");
        LocalDate orderPlaced = LocalDate.now();
        String productName = "Winter Boots";
        double price = 76.99;

        return new PlaceOrder(user, orderPlaced, productName, price);
    }
}
