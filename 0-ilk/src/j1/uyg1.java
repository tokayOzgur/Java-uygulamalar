package j1;

import java.util.Arrays;
import java.util.Random;

public class uyg1 {
    public static void main(String[] args) {
        /*
         * 100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını rastgele
         * olacak şekilde üretin. Bu işlemden sonra dizideki elemanların ortalamasını
         * hesaplayarak bu ortalamanın altında kaç tane eleman olduğunu yazdırın.
         */
        int[] dizi = new int[100];
        int toplam = 0;
        // Diziye rasgele değer eklemek
        for (int i = 0; i < 100; i++) {
            // Diziye rastgele eleman ekleme
            int deger = (int) (Math.random() * 100);
            Arrays.fill(dizi, i, i + 1, deger);

            // Toplam değeri hesaplamak
            toplam += deger;
        }
        System.out.println("\n\nDizi: ");
        diziYazdir(dizi);

        // Ortalamayı ekranı yazdrıma
        System.out.print("\n\nOrtalama: " + (toplam / 100) + "\n");

        // Ortalamanın altındaki değerlerin sayısını bulmak
        int sayac = 0;
        for (int i : dizi) {
            if (i < (toplam / 100)) {
                sayac++;
            }
        }

        System.out.println("\n\nOrtalamanın altındaki elemanların sayısı: "+sayac);
    }

    // Ekrana diziyi yazdırmma
    public static void diziYazdir(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
