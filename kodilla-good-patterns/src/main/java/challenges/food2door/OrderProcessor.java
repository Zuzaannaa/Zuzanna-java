package challenges.food2door;

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

    public BuyDto process(CreateOrder createOrder, ProducersMap producersMap) {
        boolean sold = productOrderService.orderPlaced(createOrder, producersMap);

        if(sold) {
            informationService.inform(createOrder);
            orderRepository.isSold(createOrder);
            return new BuyDto(createOrder.getBuyer(), true);
        } else {
            return new BuyDto(createOrder.getBuyer(), false);
        }
    }

}
