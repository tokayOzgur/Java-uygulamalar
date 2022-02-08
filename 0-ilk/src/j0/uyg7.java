package j0;

import java.util.Scanner;

public class uyg7 {
    // klavyeden girilen sayının faktöriyelini hesaplama
    public static void main(String[] args) {
        // Your code
        Scanner girdiAl = new Scanner(System.in);
        System.out.print("Değer: ");
        int fack = girdiAl.nextInt();
        girdiAl.close();
        if (fack == 1 || fack == 0) {
            System.out.println("Sonuç: " + 1);
        } else {
            int sonuc = 1;
            for (int i = fack; i > 0; i--) {
                sonuc *= i;
            }
            System.out.println("sonuc: " + sonuc);
        }
    }
}
