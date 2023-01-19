package z2;

public class Kolo extends Ksztalt2D{
    public Punkt Sr;
    public double r;

    public Kolo(Punkt sr, double r) {
        Sr = sr;
        this.r = r;
    }

    @Override
    public double obwod() {
        double wynik = 2* 3.14 * r;
        return wynik;
    }
}
