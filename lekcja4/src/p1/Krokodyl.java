package p1;

public class Krokodyl extends Gad{
    public Krokodyl(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Krokodyl wydaje dzwiek");
    }
}
