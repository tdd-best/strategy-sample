public class BlackCat {
    public BlackCat() {
    }

    double calculateFeeByBlackCat(Product product) {
        if (product.getWeight() > 20) {
            return 500;
        } else {
            return 100 + product.getWeight() * 10;
        }
    }
}