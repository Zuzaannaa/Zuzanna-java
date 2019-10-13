package challenges.food2door;

import java.time.LocalDate;

public class CreateOrder {
    private Buyer buyer;
    private LocalDate orderCreated;

    public CreateOrder(Buyer buyer, LocalDate orderCreated) {
        this.buyer = buyer;
        this.orderCreated = orderCreated;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public LocalDate getOrderCreated() {
        return orderCreated;
    }

    @Override
    public String toString() {
        return "CreateOrder{" +
                "buyer=" + buyer +
                ", orderCreated=" + orderCreated +
                '}';
    }
}
