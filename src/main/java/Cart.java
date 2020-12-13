public class Cart {

    public double shippingFee(String shipperName, Product product) {
        switch (shipperName) {
            case "black cat":
                Shipper shipper = new BlackCat();
                return shipper.calculateFee(product);
            case "hsinchu": {
                shipper = new Hsinchu();
                return shipper.calculateFee(product);
            }
            case "post office": {
                shipper = new PostOffice();
                return shipper.calculateFee(product);
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
    }
}