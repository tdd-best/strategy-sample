public class Cart {

    public double shippingFee(String shipper, Product product) {
        switch (shipper) {
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