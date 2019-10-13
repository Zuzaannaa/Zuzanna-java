package challenges.food2door;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args){
        OrderRetriever orderRetriever = new OrderRetriever();
        orderRetriever.retrieve();

        CreateOrder createOrder = new CreateOrder(new Buyer("Zuzanna", "Lubben", "zuz"), LocalDate.now());
        ProducersMap producersMap = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(createOrder, producersMap);

    }
}
