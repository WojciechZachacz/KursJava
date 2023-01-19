package z3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class histogram {
    public static void main(String[] args) {
        final int minT=32;
        final int maxT=126;

        String tekst="";
        File plik = new File("src/z3/literki.txt");
        try{
            Scanner in = new Scanner(plik);
            while (in.hasNextLine()){
                tekst += in.nextLine()+"\n";
            }
            System.out.println(tekst);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int tab[] = new int[maxT];
        for (int i = 0; i < tekst.length(); i++) {
            char znak = tekst.charAt(i);
            int nr_indexu = znak;
            tab[nr_indexu] += 1;
        }

        String wynik = "";
        for (int i = minT; i < maxT; i++) {
            char znak = (char)i;
            wynik += ""+znak+": "+tab[i]+"\n";
        }
        System.out.println(wynik);

        try{
            FileWriter fileWriter = new FileWriter("src/z3/hist.txt");
            fileWriter.write(wynik);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int maxMAX = 0;
        int max = 0;
        int pom = 0;
        for (int i = minT+1; i < maxT; i++) {
            if (tab[i] >= pom){
                max = maxMAX;
                pom = tab[i];
                maxMAX = i;
            }
        }
        pom = 0;
        for (int i = minT+1; i < maxT; i++) {
            if (tab[i] >= pom && i !=maxMAX){
                pom = tab[i];
                max = i;
            }
        }
        System.out.println("Index zanku najlicznejszego: "+ maxMAX);
        System.out.println("Index zanku liczebnego o index: "+ max);

        char z1 = (char)maxMAX;
        char z2 = (char)max;

        System.out.println("Znak najliczniejszy: "+z1+"\n Znak liczebny " +z2);

        String tekst2 = "";
        char tabTekst[] = tekst.toCharArray();
        for (int i = 0; i < tabTekst.length; i++) {
            if (tabTekst[i] == z1) tabTekst[i] = z2;
            else if (tabTekst[i] == z2) tabTekst[i] = z1;
            tekst2 += tabTekst[i];
        }
        System.out.println(tekst2);
        try{
            FileWriter fileWriter = new FileWriter("src/z3/zamiana.txt");
            fileWriter.write(tekst2);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String tekst3 = "";
        for (int i = tabTekst.length-1; i >= 0 ; i--) {
            tekst3 += tabTekst[i];
        }
        System.out.println(tekst3);
        try{
            FileWriter fileWriter = new FileWriter("src/z3/wspak.txt");
            fileWriter.write(tekst3);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
