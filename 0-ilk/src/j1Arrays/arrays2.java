package j1Arrays;

import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan "n" tane değer alın. Bu "n" tane değeri bir dizide saklayın ve
         * bunların ortalamasını ekrana yazdırın
         */

        Scanner girdiAl = new Scanner(System.in);
        System.out.print("n: ");
        int n = girdiAl.nextInt(); // değeri değişkende tut
        girdiAl.close();
        int[] dizi = new int[n];
        int toplam = 0;
        for (int i = 0; i < n; i++) {
            dizi[i] = girdiAl.nextInt();
            toplam += dizi[i];
        }
        System.out.println(toplam / n);
    }
}
