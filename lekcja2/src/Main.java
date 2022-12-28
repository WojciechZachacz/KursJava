import  firsPackage.NewClass;
import packages.Ludz;
public class Main {
    public static void main(String[] args) {
//        Class1 c1 = new Class1(20);
//        c1.przykladowaMetoda();

//        NewClass c2 = new NewClass(181,"Wojtek","Zachacz");
//        NewClass c3 = new NewClass();
//
//        c2.Show();
//        c3.Show();

//        Prostokat c4 = new Prostokat(20,35);
//        System.out.println("Obwod: "+c4.obliczObrow());
//        System.out.println("Pole: "+c4.obliczPole());
//
//        System.out.println("------------------------------");
//
//        Kalkulator kalk = new Kalkulator();
//        kalk.dodawanie(20,5);
//        System.out.println("Suma " + kalk.wynik);
//        kalk.odejmij(20,5);
//        System.out.println("Roznica " + kalk.wynik);
//        kalk.pomnoz(20,5);
//        System.out.println("Iloczyn " + kalk.wynik);
//        kalk.podziel(20,5);
//        System.out.println("Iloraz " + kalk.wynik);
        Ludz chop = new Ludz();
        chop.setImie("michal");
        chop.setNazwisko("Zmigrodzki");
        chop.setWzrost(179);

        System.out.println(chop.getImie());
        System.out.println(chop.getNazwisko());
        System.out.println(chop.getWzrost());
    }
}