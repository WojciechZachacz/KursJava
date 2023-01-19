package z2;

public class Trojkat extends Ksztalt2D{
    public Punkt A;
    public Punkt B;
    public Punkt C;

    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        A = a;
        B = b;
        C = c;
    }

    private void boki(){
        a = Math.sqrt(Math.pow(C.x-B.x,2)+Math.pow(C.y-B.y,2));
        b = Math.sqrt(Math.pow(A.x-C.x,2)+Math.pow(A.y-C.y,2));
        c = Math.sqrt(Math.pow(A.x-B.x,2)+Math.pow(A.y-B.y,2));
    }

    @Override
    public double obwod() {
        boki();
        double wynik = a+b+c;
        return wynik;
    }
}
