package firsPackage;

public class NewClass {
    public int wzrost ;
    public String imie ;
    public String nazwisko ;

    public NewClass() {
        this.wzrost = 169;
        this.imie = "Jan";
        this.nazwisko = "Kowalski";
    }
    public NewClass(int wiek, String imie, String nazwisko) {
        this.wzrost = wiek;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }


    public void Show(){
        System.out.println("Witaj "+imie+" "+nazwisko+" masz "+wzrost+" cm");
    }
}
