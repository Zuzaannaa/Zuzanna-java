package challenges.food2door;

public class ExtraFoodShop implements ProductProcess {
    private String state;
    private String town;
    private int storeID;

    public ExtraFoodShop(String state, String town, int storeID) {
        this.state = state;
        this.town = town;
        this.storeID = storeID;
    }


    @Override
    public void process(Product product) {
        if(product != null) {
            System.out.println("Processing order");
        }else{
            System.out.println("Transaction cancelled.");
        }

    }

    public String getState() {
        return state;
    }

    public String getTown() {
        return town;
    }

    public int getStoreID(){
        return storeID;
    }
}
