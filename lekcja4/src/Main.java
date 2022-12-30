//import p1.Zwierze;
//import p1.Ssak;
//import p1.Gad;
//import p1.Pies;
//import p1.Kot;
//import p1.Krokodyl;
//import p2.Figura;
//import p2.Trojkat;
//import p2.Kwadrat;
//import z7.Account;
import zadanieEgzaminacyjne1.Punkt;
import zadanieEgzaminacyjne1.Kolo;
import zadanieEgzaminacyjne1.Ksztalty2D;
import zadanieEgzaminacyjne1.Trojkat;
public class Main {
    public static void main(String[] args){
//        Zwierze zw1 = new Pies("Ares", 8);
//        zw1.biegnij();;
//        zw1.wydajDzwiek();
//
//        Zwierze zw2 = new Kot("Pusia", 2);
//        zw2.biegnij();
//        zw2.wydajDzwiek();
//
//        Zwierze zw3 = new Krokodyl("Kity", 14);
//        zw3.biegnij();
//        zw3.wydajDzwiek();
//        Figura trujkacik = new Trojkat(5,2,4,3);
//        trujkacik.obliczObwod();
//        trujkacik.obliczPole();
//
//        Figura kwadracik = new Kwadrat(7);
//        kwadracik.obliczObwod();
//        kwadracik.obliczPole();
//        Account Michal = new Account(2, "michal", 900);
//        Account Wojtek = new Account(4, "wojtek");
//
//        Michal.transferTo(500,Wojtek);
//        System.out.println(Michal.toString());
//        System.out.println(Wojtek.toString());
        Trojkat tr1 = new Trojkat();
        System.out.println(tr1.getC());
        System.out.println(tr1.getA());
        System.out.println(tr1.getB());
        tr1.setTrojkat(new Punkt(3,4),new Punkt(6,2), new Punkt(2,4));
        System.out.println(tr1.getC());
        System.out.println(tr1.getA());
        System.out.println(tr1.getB());
    }
}