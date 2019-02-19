package task.five;

public class VariablesSwapper {
    public static void main(String[] args) {
        double a=234;
        double b=321;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
