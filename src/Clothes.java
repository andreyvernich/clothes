import java.math.BigDecimal;

public abstract class Clothes {
    private Size size;
    private BigDecimal cost;
    private String color;

    public Clothes(Size size, BigDecimal cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }


    @Override
    public String toString() {
        return "размер: " + size +
                ", цена: " + cost +
                ", цвет: " + color;
    }

    public Size getSize() {
        return size;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
