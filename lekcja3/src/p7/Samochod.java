package p7;

public class Samochod implements Pojazd{
    @Override
    public void jedzDoPrzodu() {
        System.out.println("brum do przodu");
    }

    @Override
    public void jedzDoTulu() {
        System.out.println("brum do tylu");
    }
}
