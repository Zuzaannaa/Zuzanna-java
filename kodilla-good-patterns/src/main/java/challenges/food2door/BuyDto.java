package challenges.food2door;

public class BuyDto {
    public Buyer buyer;
    public boolean sold;

    public BuyDto(final Buyer buyer, final boolean sold) {
        this.buyer = buyer;
        this.sold = sold;
    }
}
