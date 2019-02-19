/**
 *Значение расстояния между двумя городами задаётся в сантиметрах.
 * Разработайте программу, которая вычисляет, сколько это километров и метров
 */

package task.four;

public class DistanceBetweenCities {
    public static void main(String[] args) {

        double distance=32456;
        distanceInKiloMetres(distance);
        distanceInMetres(distance);
    }

    private static void distanceInKiloMetres(double distance) {
        System.out.printf("\n%.0f centimeters is %.4f Kilometres\n", distance, distance/100_000);
    }

    private static void distanceInMetres(double distance) {
        System.out.printf("\n%.0f centimeters is %.2f metres\n", distance, distance/(100));
    }
}
