package p1;

public class Ssak extends Zwierze{
    public Ssak(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Ssak wydaje dzwiek");
    }
}
