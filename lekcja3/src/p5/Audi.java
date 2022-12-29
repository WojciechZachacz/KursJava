package p5;

public class Audi extends Samochod{
    public Audi(int maxPredkosc, int moc) {
        super(maxPredkosc, moc);
    }

    @Override
    public String toString() {
        return "Audi "+super.toString();
    }
}
