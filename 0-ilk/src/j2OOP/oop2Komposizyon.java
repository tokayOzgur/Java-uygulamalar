package j2Oop;

/* Burada kalıtım olmadan Sınıf oluştururken başka bir sınıftan yararlanıldı. 
Böylelikle gereksiz koddan kaçınıldı. 
Bu duruma KOMPOZİSYON denilir. */
public class oop2Komposizyon {
    public static void main(String[] args) {
        Araba myAraba = new Araba();
        myAraba.hareketeGec();
        myAraba.dur();

    }
}

/**
 * Motor
 */
class Motor {
    private String isim;
    private int beygirGucu;

    public Motor() {
        isim = "honda";
        beygirGucu = 220;
    }

    public void motorCalistir() {
        System.out.println(isim + " Motor çalıştı. Beygir Gücü: " + beygirGucu);
    }

    public void motorDurdur() {
        System.out.println(isim + " Motor durduruldu Beygir Gücü: " + beygirGucu);
    }
}

/**
 * * Araba
 */
class Araba {
    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYil;

    public Araba() {
        arabaMotoru = new Motor();
        renk = "Kırmızı";
        marka = "BMW";
        uretimYil = 2006;
        System.out.println("Renk: " + renk + "-- Marka: " + marka + "-- Üretim Yılı: " + uretimYil);
    }

    public void hareketeGec() {
        arabaMotoru.motorCalistir();
        System.out.println("Araba harekete geçti.");
    }

    public void dur() {
        arabaMotoru.motorDurdur();
        System.out.println("Araba durdu.");
    }
}