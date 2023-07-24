import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.

        Wine wine = new Wine("Speciale", "SuperSpeciale", "Georgia", LocalDate.of(1988, 2, 11), "Le meilleur des vins");
        System.out.println(wine.getWineCountry());
        System.out.println(wine.getDate());
        System.out.println(wine.getWineMark());
        System.out.println(wine.getWineName());
        wine.wineValable(LocalDate.of(2000, 4, 13));
        wine.wineValable(LocalDate.now());
    }
}