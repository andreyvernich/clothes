import java.util.List;

public class Atelier {

    public static void dressWoman(List<Clothes> clothes) {
        List<Clothes> clothesForWoman = clothes.stream()
                .filter(c -> c instanceof WomanClothes)
                .toList();
        clothesForWoman.forEach(System.out::println);

    }

    public static void dressMan(List<Clothes> clothes) {
        List<Clothes> clothesForMan = clothes.stream()
                .filter(c -> c instanceof ManClothes)
                .toList();
        clothesForMan.forEach(System.out::println);
    }
}
