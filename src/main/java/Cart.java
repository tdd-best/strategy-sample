import java.util.HashMap;

public class Cart {

    private final HashMap<String, Shipper> shippers = new HashMap<>() {{
        put("black cat", new BlackCat());
        put("hsinchu", new Hsinchu());
        put("post office", new PostOffice());
    }};

    public double shippingFee(String shipperName, Product product) {
        if (shippers.containsKey(shipperName)) {

            return shippers.get(shipperName).calculateFee(product);
        }
        throw new IllegalArgumentException("shipper not exist");
    }
}