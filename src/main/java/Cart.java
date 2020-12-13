public class Cart {
    private final BlackCat blackCat = new BlackCat();
    private final Hsinchu hsinchu = new Hsinchu();
    private final PostOffice postOffice = new PostOffice();

    public double shippingFee(String shipper, Product product) {
        switch (shipper) {
            case "black cat":
                return blackCat.calculateFee(product);
            case "hsinchu": {
                return hsinchu.calculateFee(product);
            }
            case "post office": {
                return postOffice.calculateFee(product);
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
    }
}