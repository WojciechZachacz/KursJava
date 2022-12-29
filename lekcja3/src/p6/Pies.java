package p6;

public class Pies extends Zwierze implements Interface{
    @Override
    public void dajGlos() {
        System.out.println("hau");
    }

    @Override
    public void biegnij() {
        System.out.println("piegne hau");
    }

    public Pies(String nazwa, double predkosc) {
        super(nazwa, predkosc);
    }
}
