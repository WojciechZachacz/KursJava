import com.sun.source.tree.ReturnTree;

public class Metody2 {
    public static void main(String[] args) {
        int[] tab = {5,6,4,25,635,4,95,86,54,45};
        method1();
        System.out.println("-------------------------");
        System.out.println(method2());
        System.out.println("-------------------------");
        System.out.println(method4("kamil","michał","bartek", " nom "));
        System.out.println("-------------------------");
        for (int ta: method7(tab)) {
            System.out.println(ta);
        }
        System.out.println("-------------------------");
        method9(5);
        System.out.println("-------------------------");
        System.out.println(method12(12));
    }
    public static void method1(){
        System.out.println("Im in method");
    }
    public static String method2(){
        return "Im returning with some text";
    }
    public static String method4(String word1, String word2, String word3, String separate){
        return word1+separate+word2+separate+word3;
    }
    public static  int[] method7(int[] tabs){
        for (int i = 0; i < tabs.length; i++) {
            for (int j = 1; j < tabs.length; j++) {
                if (tabs[j-1]>tabs[j]){
                    int tmb = tabs[j];
                    tabs[j] = tabs[j-1];
                    tabs[j-1] = tmb;
                }
            }
        }
        return tabs;
    }
    public static void method9(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    public static int method12(int n){
        int silnia = 1;
        for (int i = n; i > 0; i--) {
            silnia *= i;
        }
        return silnia;
    }
}
