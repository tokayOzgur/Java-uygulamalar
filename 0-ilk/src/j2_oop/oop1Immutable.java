package j2_oop;

public class oop1Immutable {
    public static void main(String[] args) {
        // Your code
        String[] firmalaStrings = { "Lenovo", "Inel", "AMD" };
        Bilgisayar b1 = new Bilgisayar(8, 16, firmalaStrings);
        // Bilgisayar b2 = new Bilgisayar(8, 16, new String[] { "Lenovo", "Inel", "AMD" });
        bilgisayariYazdir(b1);
    }

    public static void bilgisayariYazdir(Bilgisayar pc) {
        System.out.println("\nÇekirdek Sayısı: " + pc.getCekirdekSayisi() + "\nRam Miktarı: " + pc.getRamBoyutu()
                + "\nUretici Firmalar: " + pc.getUreticiFirmalar()[0]);
    }
}

/*
 * Immutable
 * Rule1- Tüm alanlar private olmalıdır.
 */

class Bilgisayar {
    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalar;

    public Bilgisayar(int cekirdekSayisi, int ramBoyutu, String[] ureticiFirmalar) {
        this.cekirdekSayisi = cekirdekSayisi;
        this.ramBoyutu = ramBoyutu;
        this.ureticiFirmalar = ureticiFirmalar;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

    public String[] getUreticiFirmalar() {
        return ureticiFirmalar;
    }

}