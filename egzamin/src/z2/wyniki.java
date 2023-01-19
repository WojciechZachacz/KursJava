package z2;

public class wyniki {
    public static void main(String[] args) {
        Kolo k = new Kolo(new Punkt(0,0),1);
        Trojkat tr = new Trojkat(new Punkt(0,0),new Punkt(1,1),new Punkt(-1,1));
        k.show();
        tr.show();
    }
}
