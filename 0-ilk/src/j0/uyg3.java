package j0;

import java.util.Scanner;

public class uyg3 {
    // Klavyeden girilen vize ve final notuna göre öğrencinin geçip geçmediğini
    // hesaplayan program (vize: %40 , final: %60 , Geçme Notu: 50)
    public static void main(String[] args) {

        Scanner girdiAl = new Scanner(System.in);
        System.out.println("vize: ");
        double vizeNotu = girdiAl.nextDouble();

        System.out.println("final: ");
        double finalNotu = girdiAl.nextDouble();
        girdiAl.close();// kapat
        
        int sonuc = (int) (vizeNotu * 0.4) + (int) (finalNotu * 0.6);

        String mesaj = sonuc > 49 ? "Geçti\nNotu:" + sonuc : "Kaldı\nNotu: " + sonuc;
        System.out.println(mesaj);
        
    }

}
