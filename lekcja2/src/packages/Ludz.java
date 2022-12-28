package packages;

public class Ludz {

    private int wzrost ;
    private String imie ;
    private String nazwisko ;

//    public Ludz() {
//        this.wzrost = 169;
//        this.imie = "Jan";
//        this.nazwisko = "Kowalski";
//    }
//    public Ludz(int wiek, String imie, String nazwisko) {
//        this.wzrost = wiek;
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//    }


    public void Show(){
        System.out.println("Witaj "+imie+" "+nazwisko+" masz "+wzrost+" cm");
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWzrost() {
        return wzrost;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
