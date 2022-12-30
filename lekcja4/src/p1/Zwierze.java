package p1;

public abstract class Zwierze {
    private String nazwa;
    private int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }
    public abstract void wydajDzwiek();

    public void biegnij(){
        System.out.println("zwierze biegnie");
    }
}
