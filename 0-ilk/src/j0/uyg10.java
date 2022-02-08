package j0;

import java.util.Scanner;

public class uyg10 {
    // girilen metnin palindrome olduğunu kontrol etme
    public static void main(String[] args) {
        // Your code
        Scanner girdiAl = new Scanner(System.in);

        System.out.print("Kelime giriniz: ");
        String kelime = girdiAl.nextLine();
        girdiAl.close();

        int altSinir = 0;
        int ustSinir = kelime.length() - 1;
        boolean palindromeMu = true;

        while (altSinir < ustSinir) {
            if (kelime.charAt(altSinir) != kelime.charAt(ustSinir)) {
                palindromeMu = false;
                break;
            }
            altSinir++;
            ustSinir--;
        }

        if (palindromeMu) {
            System.out.println("Kelimeniz palindrome dur.");
        } else {
            System.out.println("Kelmeniz palindrome değildir.");
        }
    }
}
