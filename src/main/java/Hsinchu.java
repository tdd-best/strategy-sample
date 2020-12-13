public class Hsinchu implements Shipper {
    public Hsinchu() {
    }

    public double calculateFee(Product product) {
        if (product.getLength() > 100 || product.getWidth() > 100 || product.getHeight() > 100) {
            return product.getSize() * 0.00002 * 1100 + 500;
        } else {
            return product.getSize() * 0.00002 * 1200;
        }
    }
}