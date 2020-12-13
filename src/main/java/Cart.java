public class Cart {
    private final BlackCat blackCat = new BlackCat();
    private final Hsinchu hsinchu = new Hsinchu();

    public double shippingFee(String shipper, Product product) {
        switch (shipper) {
            case "black cat":
                return blackCat.calculateFee(product);
            case "hsinchu": {
                return hsinchu.calculateFeeByHsinchu(product);
            }
            case "post office": {
                double feeByWeight = 80 + product.getWeight() * 10;
                double feeBySize = product.getSize() * 0.00002 * 1100;
                return Math.min(feeByWeight, feeBySize);
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
    }
}