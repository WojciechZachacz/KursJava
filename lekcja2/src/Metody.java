public class Metody {
    public static void main(String[] args) {
//        int[] tab = {5,6,4,8,4,1,6,4,9,8};
//
//        for (int wart: tab) {
//            System.out.println(wart);
//        }

        metodOne();
        methodTwo();
        System.out.println(method1(24));
    }
    public static void metodOne(){
        System.out.println("jobany");
    }
    public static void methodTwo(){
        System.out.println("nom");
    }
    public static int method1(int liczba){
        liczba = liczba+1;
        return liczba;
    }
}
