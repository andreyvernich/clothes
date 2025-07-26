import java.math.BigDecimal;

public class Tie extends Clothes implements ManClothes {

    public Tie(Size size, BigDecimal cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
    }
    @Override
    public String toString() {
        return "Галстук " + super.toString();
    }
}
