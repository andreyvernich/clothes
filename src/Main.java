import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Clothes> shmotki = new ArrayList<>();

        Clothes skirt = new Skirt(Size.XS, new BigDecimal(200), "pink");
        Clothes teeShirt = new TeeShirt(Size.S, new BigDecimal(1000), "brown");
        Clothes tie = new Tie(Size.M, new BigDecimal(500), "white");
        Clothes trousers = new Trousers(Size.L, new BigDecimal(300), "blue");

        shmotki.add(skirt);
        shmotki.add(teeShirt);
        shmotki.add(tie);
        shmotki.add(trousers);

        Atelier.dressMan(shmotki);
        System.out.println("/////////////");
        Atelier.dressWoman(shmotki);

    }
}