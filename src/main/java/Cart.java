public class Cart {
    public double shippingFee(String shipper, Product product) {
        switch (shipper) {
            case "black cat":
                if (product.getWeight() > 20) {
                    return 500;
                } else {
                    return 100 + product.getWeight() * 10;
                }
            case "hsinchu": {
                double size = getSize(product);
                if (product.getLength() > 100 || product.getWidth() > 100 || product.getHeight() > 100) {
                    return size * 0.00002 * 1100 + 500;
                } else {
                    return size * 0.00002 * 1200;
                }
            }
            case "post office": {
                double feeByWeight = 80 + product.getWeight() * 10;
                double size = getSize(product);
                double feeBySize = size * 0.00002 * 1100;
                return Math.min(feeByWeight, feeBySize);
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
    }

    private double getSize(Product product) {
        return product.getLength() * product.getWidth() * product.getHeight();
    }
}