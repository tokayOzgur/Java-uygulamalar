package j1;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        /*
         * uygulama 2
         * Kullanıcıdan hangi ayda olduğu bilgsini alıp ilgili ay değerini yazdırın
         * Ay adlarını bir dizide bulundurun
         */
        String[] dizi = { "ocak", "şubat", "mart", "nisan", "mayıs" };
        Scanner tScanner = new Scanner(System.in);

        int girdi = tScanner.nextInt();// ilk kelimeyi alma
        tScanner.close();

        switch (girdi) {
            case 0:
                System.out.println(dizi[0]);
                break;
            case 1:
                System.out.println(dizi[1]);
                break;
            case 2:
                System.out.println(dizi[2]);
                break;
            case 3:
                System.out.println(dizi[3]);
                break;
            default:
                break;
        }
    }
}
