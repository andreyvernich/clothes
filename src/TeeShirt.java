import java.math.BigDecimal;

public class TeeShirt extends Clothes implements ManClothes, WomanClothes {

    public TeeShirt(Size size, BigDecimal cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
    }

    @Override
    public void dressWoman() {
    }

    @Override
    public String toString() {
        return "Брюки " + super.toString();
    }
}
