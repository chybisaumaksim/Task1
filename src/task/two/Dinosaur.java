package task.two;

public class Dinosaur {
    private double weight;

    public Dinosaur(double weight) {
        this.weight=weight;
    }

    public double calculateInKilos() {
        return weight/1000;
    }

    public double calculateInCentners() {
        return weight/100_000;
    }

    public double calculateInTons() {
        return weight/1_000_000;
    }
}
