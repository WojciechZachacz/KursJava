package p4;

public class Kot extends Zwierzeta{
    public Kot(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public void idzDoPrzodu() {
        System.out.println("kot idzei do przodu");
    }
}
