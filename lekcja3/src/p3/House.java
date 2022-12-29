package p3;

public class House extends Building{
    private String residents;

    public House(String adres, String residents) {
        super(adres);
        this.residents = residents;
    }

    public House(String adres, String size, String residents) {
        super(adres, size);
        this.residents = residents;
    }

    public House(String adres, String size, double temperatura, String residents) {
        super(adres, size, temperatura);
        this.residents = residents;
    }

    @Override
    public String toString() {
        return "House{" +
                "residents='" + residents +" "+ '\'' +
                super.toString();
    }
}
