package z1;

public class Trojkat {
    private Punkt A;
    private Punkt B;
    private Punkt C;

    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Trojkat() {
        A = new Punkt(0,0);
        B = new Punkt(2,-2);
        C = new Punkt(2,2);
        boki();
    }
    public Trojkat(Punkt p1, Punkt p2, Punkt p3) {
        A = p1;
        B = p2;
        C = p3;
        boki();
    }
    public Trojkat(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        A = new Punkt(Ax,Ay);
        B = new Punkt(Bx,By);
        C = new Punkt(Cx,Cy);
        boki();
    }
    private void boki(){
        a = Math.sqrt(Math.pow(C.x-B.x,2)+Math.pow(C.y-B.y,2));
        b = Math.sqrt(Math.pow(A.x-C.x,2)+Math.pow(A.y-C.y,2));
        c = Math.sqrt(Math.pow(A.x-B.x,2)+Math.pow(A.y-B.y,2));
    }

    public double getA() {return a;}

    public double getB() {return b;}

    public double getC() {return c;}

    public void setA(Punkt a) {
        A = a;
        boki();
    }

    public void setB(Punkt b) {
        B = b;
        boki();
    }

    public void setC(Punkt c) {
        C = c;
        boki();
    }
}
