import java.util.Random;
import java.util.Scanner;

public class ProJeden {
    public static void main(String[] args) {
//        int[] tablicka = new int[5];
//
//        tablicka[0] =25;
//        tablicka[1] =35;
//        tablicka[2] =45;
//        tablicka[3] =625;
//        tablicka[4] =21235;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(tablicka[i]);
//        }

//        System.out.println("Jak msz na imię: ");
//        String firstName = scan.next();
//        System.out.println("Witaj " + firstName);

        Scanner scan = new Scanner(System.in);

//        System.out.println("int: ");
//        int a = scan.nextInt();
//        System.out.println(a);
//
//        System.out.println("double: ");
//        double b = scan.nextDouble();
//        System.out.println(b);
//
//        System.out.println("boolien: ");
//        boolean c = scan.nextBoolean();
//        System.out.println(c);

        // Napisz aplikacje w której utworzysz 10 elementowa tablice liczb całkowitych a następnie wyświetlicz całą zawarotosć tablicy
        // obliczysz średną arytmetyczna ze wszystkich elementów tablicy
        // obliczysz iloczyn z wartości elementów tablicy z przediały od -10 do 20 i podzielnych przez 3
        // wartoesci do tablicy wprowadza urzytkownik
        Random rn = new Random();
        int[] tablica = new int[50];
        for (int i = 0; i < tablica.length; i++) {
//            System.out.println("podej liczbe "+(i+1)+": ");
//            tablica[i] = scan.nextInt();
            tablica[i] = rn.nextInt(51)-25;
        }

        double srednia = 0;
        double iloczyn = 1;
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("index "+i+" watosc "+ tablica[i]);
            srednia += tablica[i];
            if (tablica[i] > -10 && tablica[i] < 20 && tablica[i] % 3 == 0 && tablica[i] != 0){
                iloczyn*=tablica[i];
            }
        }
        System.out.println("Srednia: " + srednia / tablica.length);
        System.out.println("Iloczyn: " + iloczyn);
    }
}
