package p2;

public class Kwadrat extends Figura{
    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public void obliczPole() {
        System.out.println(a*a);
    }

    @Override
    public void obliczObwod() {
        System.out.println(a*4);
    }
}
