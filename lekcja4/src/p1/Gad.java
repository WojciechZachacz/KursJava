package p1;

public class Gad extends Zwierze{
    public Gad(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Gad wydaje dzwiek");
    }
}
