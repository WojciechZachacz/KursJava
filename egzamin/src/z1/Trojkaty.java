package z1;

import java.io.FileWriter;
import java.io.IOException;

public class Trojkaty {
    public static void main(String[] args) {
        Trojkat trojkat = new Trojkat();
        String w1="", w2="";
        w1="a="+trojkat.getA()+" b="+trojkat.getB()+" c="+trojkat.getC();
        System.out.println(w1);
        trojkat.setA(new Punkt(-1,0.3));
        trojkat.setB(new Punkt(-1,2.3));
        trojkat.setC(new Punkt(3,1.3));
        w2="a="+trojkat.getA()+" b="+trojkat.getB()+" c="+trojkat.getC();
        System.out.println(w2);
        String wynik = w1 +"\n"+ w2;

        try{
            FileWriter fileWriter = new FileWriter("src/z1/wynik.txt");
            fileWriter.write(wynik);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
