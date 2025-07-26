import java.math.BigDecimal;

public class Trousers extends Clothes implements ManClothes, WomanClothes {

    public Trousers(Size size, BigDecimal cost, String color) {
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
        return "Свитер " + super.toString();
    }
}
