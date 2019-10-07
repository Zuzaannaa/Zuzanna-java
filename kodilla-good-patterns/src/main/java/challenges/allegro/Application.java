package challenges.allegro;

public class Application {
    public static void main(String[] args){
        PlaceOrderRetriever placeOrderRetriever = new PlaceOrderRetriever();
        PlaceOrder placeOrder = placeOrderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(placeOrder);
    }
}
