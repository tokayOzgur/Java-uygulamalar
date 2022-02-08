package j0;

import java.util.Scanner;

public class j0 {
    public static void main(String[] args) {

        // for
        /*
         * for (int i=0;i<10;i++){
         * System.out.println(i);
         * }
         */

        // sonsuz döngü - for
        /*
         * for (; ; ) {
         * 
         * }
         */
        // _________________________________________
        // Scanner - kullanıcıdan girdi alma
        Scanner girdi = new Scanner(System.in);

        int gelenDeger = girdi.nextInt();
        girdi.close();
        System.out.println("kullanıcı değeri: " + gelenDeger);
    }
}
