package j2_oop;

public class oop6_final {
    public static void main(String[] args) {

        int sayi1 = 10;
        final int sayi2 = 10;

        sayi1 = 11;
        // sayi2 = 11; //final olarak tanımlanmış değişkenin değeri sabittir,
        // deiştirilemez
        // final olarak oluşturulan class lar inherit edilemez
        System.out.println(sayi1+sayi2);
    }

}
