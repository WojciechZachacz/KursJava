package p4;

public class Pies extends Zwierzeta{
    public Pies(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void idzDoPrzodu() {
        System.out.println("Pies idzie do przodu");
    }
}
