package j2_oop;

public class oop0_giris {

    public static void main(String[] args) {
        oop0Ogrenci ogr1 = new oop0Ogrenci(3, "Özgür", (byte) 1, true);
        ogr1.ogrBigileriniYazdir();
    }

    public class Dikdortgen {
        int en;
        int boy;

        public Dikdortgen() {

        }

        public int alanHesapla() {
            return en * boy;
        }
    }
}
