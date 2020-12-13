public class PostOffice {
    public PostOffice() {
    }

    double calculateFee(Product product) {
        double feeByWeight = 80 + product.getWeight() * 10;
        double feeBySize = product.getSize() * 0.00002 * 1100;
        return Math.min(feeByWeight, feeBySize);
    }
}