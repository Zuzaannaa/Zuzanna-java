package challenges.food2door;

import java.time.LocalDate;
import java.util.HashMap;

public class OrderRetriever {
    public ProducersMap retrieve(){
        ProductProcess productProcessExtraFoodShop = new ExtraFoodShop("Washington", "Snohomish", 5398);
        ProductProcess productProcessHealthyShop = new HealthyShop("Utah", "Logan", 3241);
        ProductProcess productProcessGlutenFreeShop = new GlutenFreeShop("Georgia", "Ellijay", 6457);

        Product product1 = new Product("ProteinPowder", 34.99, 20);
        Product product2 = new Product("Chia Seeds", 12.50, 30);
        Product product3 = new Product("Protein Milk", 17.99, 14);

        Product product4 = new Product("Oranges", 2.99, 99);
        Product product5 = new Product("Avocado", 4.99, 50);
        Product product6 = new Product("Pineapples", 7.50, 87);

        Product product7 = new Product("Goat Cheese", 8.98, 7);
        Product product8 = new Product("GF bread loaf", 5.99, 2);
        Product product9 = new Product("GF Marinara Sauce", 2.69, 5);

        ProducersMap extraShopProducts = new ProducersMap();

        extraShopProducts.addToMap(productProcessExtraFoodShop, product1);
        extraShopProducts.addToMap(productProcessExtraFoodShop, product2);
        extraShopProducts.addToMap(productProcessExtraFoodShop, product3);

        ProducersMap healthyShopProducts = new ProducersMap();

        healthyShopProducts.addToMap(productProcessHealthyShop, product4);
        healthyShopProducts.addToMap(productProcessHealthyShop, product5);
        healthyShopProducts.addToMap(productProcessHealthyShop, product6);

        ProducersMap gfShopProducts = new ProducersMap();

        gfShopProducts.addToMap(productProcessGlutenFreeShop, product7);
        gfShopProducts.addToMap(productProcessGlutenFreeShop, product8);
        gfShopProducts.addToMap(productProcessGlutenFreeShop, product9);

        return gfShopProducts;


    }
}
