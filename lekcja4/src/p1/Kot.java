package p1;

public class Kot extends Ssak{
    public Kot(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("miau miau");
    }
}
