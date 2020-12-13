public class Cart {
    public double shippingFee(String shipper, double length, double width, double height, double weight) {
        switch (shipper) {
            case "black cat":
                if (weight > 20) {
                    return 500;
                } else {
                    return 100 + weight * 10;
                }
            case "hsinchu": {
                double size = length * width * height;
                if (length > 100 || width > 100 || height > 100) {
                    return size * 0.00002 * 1100 + 500;
                } else {
                    return size * 0.00002 * 1200;
                }
            }
            case "post office": {
                double feeByWeight = 80 + weight * 10;
                double size = length * width * height;
                double feeBySize = size * 0.00002 * 1100;
                return Math.min(feeByWeight, feeBySize);
            }
            default:
                throw new IllegalArgumentException("shipper not exist");
        }
    }
}