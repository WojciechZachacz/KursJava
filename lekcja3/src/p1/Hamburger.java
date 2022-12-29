package p1;

public class Hamburger {
    private double cena;
    private String rodzajBulki;
    private String dodatek1;
    private String dodatek2;
    private String rozmiar;

    public Hamburger(double cena, String rodzajBulki, String dodatek1, String dodatek2, String rozmiar) {
        this.cena = cena;
        this.rodzajBulki = rodzajBulki;
        this.dodatek1 = dodatek1;
        this.dodatek2 = dodatek2;
        this.rozmiar = rozmiar;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "cena=" + cena +
                ", rodzajBulki='" + rodzajBulki + '\'' +
                ", dodatek1='" + dodatek1 + '\'' +
                ", dodatek2='" + dodatek2 + '\'' +
                ", rozmiar='" + rozmiar + '\'' +
                '}';
    }
}
