package p3;

public class Warehause extends Building{
    private String availability;

    public Warehause(String adres, String availability) {
        super(adres);
        this.availability = availability;
    }

    public Warehause(String adres, String size, String availability) {
        super(adres, size);
        this.availability = availability;
    }

    public Warehause(String adres, String size, double temperatura, String availability) {
        super(adres, size, temperatura);
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Warehause{" +
                "availability='" + availability +" "+ super.toString()+
                "} ";
    }
}
