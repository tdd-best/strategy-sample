public class Cart {

    public double shippingFee(String shipperName, Product product) {
        switch (shipperName) {
            case "black cat":
                return new BlackCat().calculateFee(product);
            case "hsinchu": {
                return new Hsinchu().calculateFee(product);
            }
            case "post office": {
                return new PostOffice().calculateFee(product);
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
    }
}