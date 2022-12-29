package p5;

public class BMW extends Samochod{
    public BMW(int maxPredkosc, int moc) {
        super(maxPredkosc, moc);
    }

    @Override
    public String toString() {
        return "BMW "+super.toString();
    }
}
