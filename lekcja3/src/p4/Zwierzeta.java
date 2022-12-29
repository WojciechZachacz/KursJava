package p4;

public class Zwierzeta {
    private String nazwa;
    private int wiek;

    public Zwierzeta(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public void idzDoPrzodu(){
        System.out.println("zwierze idzie");
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }
}
