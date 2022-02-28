package j2OOP;

/**
 * Polymorphism: üst sınıf değişkeninin alt sınıf nesnelerini referans
 * edebilmesidir
 */
public class opp5Polymorphism {

    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        Kopek kopek = new Kopek("Golden");
        Kedi kedi = new Kedi("Dişi");

        isminiSoyle(h1);
        isminiSoyle(kopek);
        isminiSoyle(kedi);

    }

    public static void isminiSoyle(Hayvan hayvan) {
        hayvan.isminiSoyle();
    }

}

class Hayvan {
    private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public void isminiSoyle() {

        System.out.println("Hayvan Sınıfı Nesnesi");
    }
}

class Kopek extends Hayvan {
    private String tur;

    public Kopek(String tur) {
        setAyakSayisi(4);
        setTur(tur);
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void isminiSoyle() {
        System.out.println("Köpek Nesnesi");
    }
}

class Kedi extends Hayvan {
    private String cins;

    public Kedi(String cins) {
        setAyakSayisi(4);
        setCins(cins);
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public void isminiSoyle() {
        System.out.println("Kedi Nesnesi");
    }
}