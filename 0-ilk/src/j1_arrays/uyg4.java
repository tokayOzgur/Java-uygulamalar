package j1_arrays;

public class uyg4 {
    public static void main(String[] args) {
        /*
         * Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
         * Ekok(s1xs2) x ebob(s1xs2) =(s1xs2); buna uygun olacak şekilde çıktıları
         * bulun.
         */
        // System.out.println(ekok(4, 6));
        int ebb = ebob(20, 15);
        int ekk = ekok(20, 15);
        if (ebb * ekk == (20 * 15)) {
            System.out.println("Denklem sağlandı.");
            System.out.println("\nEbob: " + ebb + "\nEkok: " + ekk);
        }
        System.out.println("\nSağlamlama: " + 20 * 15);
    }

    public static int ebob(int s1, int s2) {
        for (int i = s1 < s2 ? s1 : s2; i > 0; i--) {
            if ((s1 % i == 0) && (s2 % i == 0)) {
                return i;
            }
        }
        return -1;
    }

    public static int ekok(int s1, int s2) {
        for (int i = s1 > s2 ? s1 : s2; i < (s1 * s2) + 1; i++) {
            if ((i % s1 == 0) && (i % s2 == 0)) {
                return i;
            }
        }
        return -1;

    }
}
