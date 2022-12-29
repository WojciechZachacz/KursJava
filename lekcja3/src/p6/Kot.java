package p6;

public class Kot extends Zwierze implements Interface{
    public Kot(String nazwa, double predkosc) {
        super(nazwa, predkosc);
    }

    @Override
    public void dajGlos() {
        System.out.println("Miew");
    }

    @Override
    public void biegnij() {
        System.out.println("biegne miew");
    }
}
