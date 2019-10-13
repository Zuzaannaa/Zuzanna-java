package challenges.food2door;

public class HealthyShop implements ProductProcess {
    private String state;
    private String town;
    private int storeID;

    public HealthyShop(String state, String town, int storeID) {
        this.state = state;
        this.town = town;
        this.storeID = storeID;
    }

    public String getState() {
        return state;
    }

    public String getTown() {
        return town;
    }

    public int getStoreID() {
        return storeID;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "productName='" + state + '\'' +
                ", price=" + storeID +
                '}';
    }

    @Override
    public void process(Product product) {
        if(product != null) {
            System.out.println("Processing order");
        }else{
            System.out.println("Transaction cancelled.");
        }
    }
}
