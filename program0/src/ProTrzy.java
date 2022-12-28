import java.util.Random;

public class ProTrzy {
    public static void main(String[] args) {
        //u tablica 4/6
        //przypisz wartosci wylosowane z przedziłu[-10,20]
        //iloczyn z wartosści tablicy których indexy sa nieparzyste
        //obliczy sumę z watrości tablicy które są niepodzeielne przez 4
        Random rn = new Random();
        int[][] tablica2W = new int[4][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                tablica2W[i][j] = rn.nextInt(31)-10;
            }
        }
        double ilocz = 1;
        double suma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (i%2==0 && j%2==0){
                    ilocz *= tablica2W[i][j];
                }
                if (tablica2W[i][j] % 4 != 0)
                    suma+=tablica2W[i][j];
            }
        }
        System.out.println("iloczyn: "+ilocz);
        System.out.println("suma: "+suma);
    }
}
