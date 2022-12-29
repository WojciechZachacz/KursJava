//import p1.Hamburger;
//import p1.HamburgerXXL;
//import p2.Motocykle;
//import p2.SportMotocykle;
//import p3.Building;
//import p3.Warehause;
//import p3.House;
import  p4.Zwierzeta;
import  p4.Pies;
import  p4.Kot;
public class Main {
    public static void main(String[] args) {

//        Hamburger ham1 = new Hamburger(22, "Briosz", "pomidor", "ogurek", "S");
//        System.out.println(ham1.toString());
//        HamburgerXXL ham2 = new HamburgerXXL(23, "Briosz", "pomidor2x", "ogurek3x");
//        System.out.println(ham2.toString());

//        Motocykle honda1 = new Motocykle(15000);
//        SportMotocykle honda2 = new SportMotocykle();
//        System.out.println(honda1.toString());
//        System.out.println(honda2.toString());

//        Building domeczek = new Building("sloneczna 30", "M", 26);
//        House dom = new House("lysa gora 193", "L", 20,"6");
//        Warehause tak = new Warehause("swiecany", "L", 30, "nie");
//
//        System.out.println(domeczek.toString());
//        System.out.println(dom.toString());
//        System.out.println(tak.toString());

        Zwierzeta zwieze1 = new Zwierzeta("Kamil", 17);
        zwieze1.idzDoPrzodu();
        Zwierzeta zwieze2 = new Kot("Michal", 18);
        zwieze2.idzDoPrzodu();
        Zwierzeta zwieze3 = new Pies("Bartek", 18);
        zwieze3.idzDoPrzodu();
        Kot kot1 = new Kot("Ja", 18);
        kot1.idzDoPrzodu();

        Zwierzeta[] zwiezenta = new Zwierzeta[4];
        zwiezenta[0] = zwieze1;
        zwiezenta[1] = zwieze2;
        zwiezenta[2] = zwieze3;
        zwiezenta[3] = kot1;

        for (Zwierzeta zw: zwiezenta) {
            System.out.println(zw.getNazwa());
        }

    }
}