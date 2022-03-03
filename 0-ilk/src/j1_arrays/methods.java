package j1_arrays;

import java.util.Scanner;

public class methods {
    // Metotlar

    public static int menuGoster() {
        System.out.println("***Menü***\n1- İki sayının toplamını bul\n2- İki sayının farkını bul");
        Scanner girdiAl = new Scanner(System.in);

        System.out.print("Tercih: ");
        int tercih = girdiAl.nextInt();
        girdiAl.close();

        return tercih;
    }

    public static int topla(int a, int b) {
        return (a + b);
    }

    public static int fark(int a, int b) {
        return (a - b);
    }

    public static void main(String[] args) {
        // Your code

        int secenek = menuGoster();

        /*
         * Scanner girdiAl = new Scanner(System.in);
         * 
         * System.out.print("\na: ");
         * int a = girdiAl.nextInt();
         * 
         * System.out.print("\nb: ");
         * int b = girdiAl.nextInt();
         * 
         * girdiAl.close();
         */

        int a = 5, b = 3;

        if (secenek == 1) {
            System.out.println(topla(a, b));
        } else if (secenek == 2) {
            System.out.println(fark(a, b));
        } else {
            System.out.println("Giriş işlemi hatası!");
        }
    }

}
