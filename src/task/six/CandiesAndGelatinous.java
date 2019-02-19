/**Разработать программу вычисления того, сколько стоит один кг шоколадных
 * конфет и 1 один кг желатинок, а также во сколько раз шоколадные конфеты
 * дороже (дешевле) желатинок, если известно, что X кг шоколадных конфет
 * стоит A бел. рублей, а Y кг желатинок стоит B бел. рублей
 */

package task.six;

public class CandiesAndGelatinous {
    public static void main(String[] args) {

        double candyPrice = 45600;
        double gelatinousPrice = 25500;
        double amountOfCandies = 18;
        double amountOfGelatinous= 25;

        double priceKiloOfCandies = candyPrice/amountOfCandies;
        double priceKiloOfGelatinous = gelatinousPrice/amountOfGelatinous;
        priceRatio(priceKiloOfCandies, priceKiloOfGelatinous);
        }

    private static void priceRatio(double priceKiloOfCandys, double priceKiloOfGelatinous) {
        System.out.printf("\nCandies is more expensive " +
                "than gelatinous in %.2f times", priceKiloOfCandys/priceKiloOfGelatinous);
    }


}



