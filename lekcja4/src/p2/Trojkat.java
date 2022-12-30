package p2;

public class Trojkat extends Figura{
    private double a;
    private double b;
    private double c;
    private double h;

    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void obliczPole() {
        System.out.println(2/(a*h));
    }

    @Override
    public void obliczObwod() {
        System.out.println(a+b+c);
    }
}
