package challenges.allegro;

public class BuyDto {
    public User user;
    public boolean sold;

    public BuyDto(final User user, final boolean sold) {
        this.user = user;
        this.sold = sold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return sold;
    }
}
