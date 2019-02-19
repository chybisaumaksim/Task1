/**
 * Разработайте программу-конвертор для различных шкал температур (из градусов Цельсия в градусы
 * Фаренгейта или Кельвина и наоборот) или для различных валют (к примеру, из бел. руб. в евро или наоборот).
 * Можно использовать любую предметную область для создания однотипных приложений (к примеру, конвертор
 * значений углов из градусы в радианы и наоборот).
*/

package task.seven;

public class CurrencyConverter {
    public static void main(String[] args) {
        double currency=2343;
        rublesInDolars(currency);
        rublesInEuro(currency);
        rublesInHryvnia(currency);
    }

    private static void rublesInDolars(double currency) {
        System.out.printf("\n%.0f rubles is %.3f in dollars", currency, currency/2.15);
    }

    private static void rublesInEuro(double currency) {
        System.out.printf("\n%.0f rubles is %.3f in euro", currency, currency/2.542);
    }

    private static void rublesInHryvnia(double currency) {
        System.out.printf("\n%.0f rubles is %.3f in hryvnias", currency, currency/0.036702 );
    }
}
