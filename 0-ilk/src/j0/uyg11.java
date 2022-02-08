package j0;

import java.util.Scanner;

public class uyg11 {
    // n'e kadar olan asal sayıları ekrana yazdıran program
    public static void main(String[] args) {
        // Your code
        Scanner girdiAl = new Scanner(System.in);
        System.out.print("n: ");
        int n = girdiAl.nextInt();

        girdiAl.close();

        String asal_liste = "2,";
        for (int i = 3; i < n; i++) {
            boolean aslaMi = true;

            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    aslaMi = false;
                    break;
                }
            }
            if (aslaMi) {
                asal_liste += i + ",";
            }
        }
        System.out.println(asal_liste);
    }
}
