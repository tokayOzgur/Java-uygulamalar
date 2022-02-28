package j2OOP;

public class oop3Inheritance {
    /*
     * Türetme işlemi 'extends' anahtar kelimesi ile yapılır.
     * Private olmayan değişken ve metotlara erişim sağlanmış oluyor.
     * 'clone': nesneyi kopyalar.
     * Her sınıf 'Object' sınıfından türetilmiştir.
     * Java da çoklu kalıtım yoktur. Her sınıf en fazla bir sınıftan tüüretilebilir.
     */

    public static void main(String[] args) {
        GeometrikSekil aSekil = new GeometrikSekil(4, 4);
        aSekil.alanHesapla();
        System.out.println("***************************");

        Dikdortgen dikdortgen = new Dikdortgen(6, 8);
        dikdortgen.ozellikleriYazdir();
        System.out.println("***************************");

        Kare kare = new Kare(10);
        kare.ozellikleriYazdir();
        System.out.println("***************************");

    }
}

class Kare extends Dikdortgen {

    public Kare(int en) {

        super(en);
        System.out.println("Kare");
        // TODO Auto-generated constructor stub
    }

}

class Dikdortgen extends GeometrikSekil {
    public void ozellikleriYazdir() {
        System.out.println("En: " + getEn() + "\nBoy: " + getBoy());
        alanHesapla();
        cevreHesapla();
    }

    public Dikdortgen(int en, int boy) {
        setEn(en);
        setBoy(boy);
        System.out.println("Dikdörtgen");
    }

    public Dikdortgen(int en) {
        setEn(en);
        setBoy(en);
        System.out.println("Dikdörtgen");
    }
}

class GeometrikSekil {

    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        System.out.println("Geometrik Şekil");

    }

    public GeometrikSekil() {
        System.out.println("Geometrik Şekil");
    }

    public GeometrikSekil(int en) {
        this.en = en;
        System.out.println("Geometrik Şekil");
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public void alanHesapla() {
        System.out.println("Alan: " + (en * boy));
    }

    public void cevreHesapla() {
        System.out.println("Çevre: " + (en * 2 + 2 * boy));
    }

}
