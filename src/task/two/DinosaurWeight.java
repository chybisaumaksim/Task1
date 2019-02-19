/**
 * Масса динозавра задаётся в граммах. Разработайте программу, которая вычисляет,
 * сколько это килограммов, центнеров и т.д
 */

package task.two;

public class DinosaurWeight {

    public static void main(String[] args) {

        Dinosaur dino = new Dinosaur(50_000_000);
        dino.calculateInKilos();
        dino.calculateInCentners();
        dino.calculateInTons();
    }
}
