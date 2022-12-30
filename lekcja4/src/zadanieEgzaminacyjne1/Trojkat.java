package zadanieEgzaminacyjne1;

public class Trojkat extends Ksztalty2D{

    public Punkt A;
    public Punkt B;
    public Punkt C;

    private double a;
    private double b;
    private double c;

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        A = a;
        B = b;
        C = c;
        boki();
    }
    public Trojkat(double ax, double bx, double cx, double ay, double by, double cy) {
        A = new Punkt(ax, ay);
        B = new Punkt(bx, by);
        C = new Punkt(cx, cy);
        boki();
    }

    public Trojkat() {
        A = new Punkt(0,0);
        B = new Punkt(2,-2);
        C = new Punkt(2,2);
        boki();
    }

    @Override
    public double obwod() {
        return 0;
    }
    private void boki(){
        a = Math.sqrt(Math.pow(C.x - B.x, 2)+Math.pow(C.y - B.y, 2));
        b = Math.sqrt(Math.pow(A.x - C.x, 2)+Math.pow(A.y - C.y, 2));
        c = Math.sqrt(Math.pow(A.x - B.x, 2)+Math.pow(A.y - B.y, 2));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setTrojkat(Punkt a, Punkt b, Punkt c) {
        A = a;
        B = b;
        C = c;
        boki();
    }
}
