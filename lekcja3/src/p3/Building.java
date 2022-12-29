package p3;

public class Building {
    private String adres;
    private String size;
    private double temperatura;


    public Building(String adres) {
        this.adres = adres;
    }

    public Building(String adres, String size) {
        this(adres);
        this.size = size;
    }

    public Building(String adres, String size, double temperatura) {
        this(adres, size);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return  "adres='" + adres + '\'' +
                ", size='" + size + '\'' +
                ", temperatura=" + temperatura;
    }
}