package j0;

import java.util.Scanner;

public class Uygulamar1 {
    public static void main(String[] args) {

        //Klavyeden girilen 3 sayının ortalaması
        
        Scanner girdiAl = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        int x1  =girdiAl.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int x2  =girdiAl.nextInt();

        System.out.println("Üçüncü sayıyı giriniz: ");
        int x3  =girdiAl.nextInt();


        int sonuc = x1+x2+x3;
        System.out.println("Sonuç: "+sonuc);
    }
}
