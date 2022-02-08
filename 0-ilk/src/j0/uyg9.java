package j0;

import java.util.Scanner;

public class uyg9 {
    // EBOB uygulaması
    public static void main(String[] args) {
        // Your code
        Scanner girdiAl = new Scanner(System.in);

        System.out.print("x1: ");
        int x1 = girdiAl.nextInt();

        System.out.print("\nx2: ");
        int x2 = girdiAl.nextInt();

        girdiAl.close();
        int min_x = 0;
        if (x1 >= x2) {
            min_x = x2;
        } else {
            min_x = x1;
        }
        for (int i = min_x; i > 1; i--) {
            if (x1 % i == 0 && x2 % i == 0) {
                System.out.println("EBOB: " + i);
                break;
            }
        }

    }
}
