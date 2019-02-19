package task.one;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void isTriangle() {
        if (a<b+c && b<a+c && c<b+a){
            System.out.println("Is triangle");
        } else {
            System.out.println("Isn't triangle");
        }
    }
}

