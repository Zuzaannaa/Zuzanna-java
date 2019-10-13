package challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class ProducersMap {
    public Map<ProductProcess, Product> offer = new HashMap<ProductProcess, Product>();

    public void addToMap(ProductProcess productProcess, Product product){
        offer.put(productProcess, product);
    }


    public Map<ProductProcess, Product> getOffer() {
        return offer;
    }
}
