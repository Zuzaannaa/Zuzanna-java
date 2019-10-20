package challenges.allegro;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public BuyDto process(final PlaceOrder placeOrder) {
        boolean sold = productOrderService.sold(placeOrder);

        if (sold) {
            informationService.inform(placeOrder);
            orderRepository.createOrder(placeOrder);
            return new BuyDto(placeOrder.getUser(), true);
        } else {
            return new BuyDto(placeOrder.getUser(), false);
        }
    }
}
