import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    private final Cart cart = new Cart();
    private final String blackCat = "black cat";
    private final String hsinchu = "hsinchu";
    private final String postOffice = "post office";

    @Test
    void black_cat_with_light_weight() {
        double shippingFee = cart.shippingFee(blackCat, 30, 20, 10, 5);
        feeShouldBe(150, shippingFee);
    }

    @Test
    void black_cat_with_heavy_weight() {
        double shippingFee = cart.shippingFee(blackCat, 30, 20, 10, 50);
        feeShouldBe(500, shippingFee);
    }

    @Test
    void hsinchu_with_small_size() {
        double shippingFee = cart.shippingFee(hsinchu, 30, 20, 10, 50);
        feeShouldBe(144, shippingFee);
    }

    @Test
    void hsinchu_with_huge_size() {
        double shippingFee = cart.shippingFee(hsinchu, 100, 20, 10, 50);
        feeShouldBe(480, shippingFee);
    }

    @Test
    void post_office_by_weight() {
        double shippingFee = cart.shippingFee(postOffice, 100, 20, 10, 3);
        feeShouldBe(110, shippingFee);
    }

    @Test
    void post_office_by_size() {
        double shippingFee = cart.shippingFee(postOffice, 100, 20, 10, 300);
        feeShouldBe(440, shippingFee);
    }

    private void feeShouldBe(double expected, double shippingFee) {
        assertEquals(expected, shippingFee, 0.00);
    }
}