package challenges.food2door;

public class GlutenFreeShop implements ProductProcess {
    private String state;
    private String town;
    private int storeID;

    public GlutenFreeShop(String state, String town, int storeID) {
        this.state = state;
        this.town = town;
        this.storeID = storeID;
    }

    public String getState() {
        return state;
    }

    public int getStoreID() {
        return storeID;
    }

    public String getTown() {
        return town;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
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
