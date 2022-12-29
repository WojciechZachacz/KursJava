package p5;

public class Skoda extends Samochod{
    public Skoda(int maxPredkosc, int moc) {
        super(maxPredkosc, moc);
    }

    @Override
    public String toString() {
        return "Skoda "+super.toString();
    }
}
