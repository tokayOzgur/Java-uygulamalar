package j1Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays6_metods {
    public static void main(String[] args) {
        // Your code
        int[] dizi = { 12, 3, 54, 65, 21, 34, 25, 64, 23, 76, 98 };
        int[] dizi2 = { 12, 3, 54, 65, 21, 34, 25, 64, 23, 76, 98 };
        System.out.println("\nDizi: ");
        diziYazdir(dizi);

        // ***** Sıralama **********
        // System.out.println("\n\nSıralanmış; ");
        // Arrays.sort(dizi); // Sıralama metodu
        // Arrays.sort(dizi,2,5); // Belirtilen aralıkta sıralama yapar
        Arrays.parallelSort(dizi); // Daha hızlı sıralar
        Arrays.parallelSort(dizi2); // Daha hızlı sıralar
        // diziYazdir(dizi);

        // ******** Arama **********
        // System.out.println("\n\n" + Arrays.binarySearch(dizi, 3));

        // ******** Eşit mi ********
        System.out.println("\n\nEşit mi? " + Arrays.equals(dizi, dizi2));

        // ******** fill() metodu ************
        int[] yeniDizi = new int[20];
        // Arrays.fill(yeniDizi, 20);
        Arrays.fill(yeniDizi, 2, 5, 11);// 2. dan 5. indexlere 11 değerini ata
        System.out.println("\n\nYeni Dizi: ");
        diziYazdir(yeniDizi);
    }

    public static void diziYazdir(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
