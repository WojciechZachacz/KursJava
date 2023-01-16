package zadanie3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        final int MIN_TAB = 32;
        final int MAX_TAB = 126;
        //p3.1
        String tekst = "";
        File plik = new File("src/zadanie3/literki.txt");

        try {
            Scanner in = new Scanner(plik);
            while (in.hasNextLine()){
                tekst += in.nextLine()+"\n";
            }
            System.out.println(tekst);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //p3.2
        int tab[] = new int[MAX_TAB];
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            int nr_indexu = znak;
            tab[nr_indexu] += 1;
        }

        //p3.3
        String wynik = "";
        for (int j = MIN_TAB; j < MAX_TAB; j++) {
            char znak = (char)j;
            wynik += ""+znak+": "+tab[j]+"\n";
        }
        System.out.println(wynik);

        try{
            FileWriter fileWriter = new FileWriter("src/zadanie3/histogram.txt");
            fileWriter.write(wynik);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //p3.4
        int max_max=0;
        int max=0;
        int pom=0;
        for (int i = MIN_TAB+1; i < MAX_TAB; i++) {
            if (tab[i]>=pom){
                max = max_max;
                pom = tab[i];
                max_max=i;
            }
        }
        pom=0;
        for (int i = MIN_TAB+1; i < MAX_TAB; i++) {
            if (tab[i] >= pom && i != max_max){
                pom=tab[i];
                max=i;
            }
        }
        System.out.println("Index zanku najlicznejszego: "+ max_max);
        System.out.println("Index zanku liczebnego o index: "+ max);

        char z1=(char)max_max;
        char z2=(char)max;

        System.out.println("Znak najliczniejszy: "+z1+"\n Znak liczebny" +z2);

        String tekst2 = "";
        char tabTekst[] = tekst.toCharArray();
        for (int i = 0; i < tabTekst.length; i++) {
            if (tabTekst[i] == z1) tabTekst[i]=z2;
            else if (tabTekst[i] == z2) tabTekst[i]=z1;
            tekst2 += tabTekst[i];
        }
        System.out.println(tekst2);
        try{
            FileWriter fileWriter = new FileWriter("src/zadanie3/zamiana.txt");
            fileWriter.write(tekst2);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //p3.5
        String tekst3 = "";
        for (int i = tabTekst.length-1; i >= 0; i--) {
            tekst3 += tabTekst[i];
        }
        System.out.println(tekst3);

        try{
            FileWriter fileWriter = new FileWriter("src/zadanie3/wspak.txt");
            fileWriter.write(tekst3);
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
