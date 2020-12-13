import java.util.HashMap;

public class Cart {

    private HashMap<String, Shipper> shippers = new HashMap<>() {{
        put("black cat", new BlackCat());
        put("hsinchu", new Hsinchu());
        put("post office", new PostOffice());
    }};

    public double shippingFee(String shipperName, Product product) {
        return shippers.get(shipperName).calculateFee(product);
    }
}