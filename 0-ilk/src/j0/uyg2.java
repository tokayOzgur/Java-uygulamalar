package j0;

import java.util.Scanner;

public class uyg2 {
    public static void main(String[] args) {
        // Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız

        Scanner girdiAl = new Scanner(System.in);
        System.out.print("Kenar 1: ");
        int k1 = girdiAl.nextInt();

        System.out.print("Kenar 2: ");
        int k2 = girdiAl.nextInt();

        System.out.print("Kenar 3: ");
        int k3 = girdiAl.nextInt();

        girdiAl.close();

        if (k1 == k2 && k1 == k3) {
            System.out.println("Eşkenar  üçgen");
        } else if ((k1 == k2 && k1 != k3) || (k2 == k3 && k1 != k3)) {
            System.out.println("İkizkenar");
        } else if ((k1 != k2 && k2 != k3) || (k1 != k3 && k1 != k2)) {
            System.out.println("Çeşitkenar");
        } else {
            System.out.println("Hata var!");
        }

    }

}
