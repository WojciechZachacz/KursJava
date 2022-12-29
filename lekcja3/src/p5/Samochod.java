package p5;

public class Samochod {
    private int maxPredkosc;
    private int moc;

    public Samochod(int maxPredkosc, int moc) {
        this.maxPredkosc = maxPredkosc;
        this.moc = moc;
    }

    @Override
    public String toString() {
        return  "maxPredkosc=" + maxPredkosc +
                ", moc=" + moc ;
    }

    public int getMaxPredkosc() {
        return maxPredkosc;
    }

    public int getMoc() {
        return moc;
    }
}
