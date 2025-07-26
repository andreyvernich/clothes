import java.math.BigDecimal;

public class Skirt extends Clothes implements WomanClothes {

    public Skirt(Size size, BigDecimal cost, String color) {
        super(size, cost, color);

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        return "Юбка " + super.toString();
    }
}
