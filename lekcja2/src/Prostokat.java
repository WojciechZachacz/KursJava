public class Prostokat {
    public int dlugoscBoku1 ;
    public int dlugoscBoku2 ;

    public Prostokat(int dlugoscBoku1, int dlugoscBoku2) {
        this.dlugoscBoku1 = dlugoscBoku1;
        this.dlugoscBoku2 = dlugoscBoku2;
    }


    public int obliczPole(){
        int pole = dlugoscBoku1 * dlugoscBoku2;
        return pole;
    }
    public int obliczObrow(){
        int obwod = 2*dlugoscBoku1+2*dlugoscBoku2;
        return obwod;
    }
}
