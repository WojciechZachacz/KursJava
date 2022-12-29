package p6;

public class Zwierze {
    private String nazwa;
    private double predkosc;

    public Zwierze(String nazwa, double predkosc) {
        this.nazwa = nazwa;
        this.predkosc = predkosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getPredkosc() {
        return predkosc;
    }
}
