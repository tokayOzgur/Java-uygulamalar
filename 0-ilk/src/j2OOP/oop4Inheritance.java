package j2OOP;

public class oop4Inheritance {
    public static void main(String[] args) {

        Personel mudur = new Personel("ahmet", 1234567890, 1);
        mudur.personelBilgileriYaz();

        Ogrenci test = new Ogrenci();
        test.ogrenciBilgileriYaz();
    }
}

class Personel {
    private String isim;
    private long tcNo;
    private int yas;

    public Personel() {
        isim = "Null";
        tcNo = 0;
        yas = 18;
    }

    public Personel(String isim, long tcNo, int yas) {
        setIsim(isim);
        setTcNo(tcNo);
        setYas(yas);
    }

    public int getYas() {
        return yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public void setYas(int yas) {
        if (yas > 18)
            this.yas = yas;
        else
            this.yas = 18;
    }

    public void personelBilgileriYaz() {
        System.out.println("*******************************" + "\nAd: " + isim + "\nYaş: " + yas + "\nTC No: " + tcNo);
    }
}

class Ogrenci {
    private String isim;
    private int yas;
    private long tcNo;
    private int okulNo;

    public Ogrenci() {
        isim = "Null";
        yas = 0;
        tcNo = 0;
        okulNo = 0;
    }

    public Ogrenci(String isim, int yas, long tcNo, int okulNo) {
        setIsim(isim);
        setOkulNo(okulNo);
        setTcNo(tcNo);
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas > 18)
            this.yas = yas;
        else
            yas = 18;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public void ogrenciBilgileriYaz() {
        System.out.println("*******************************" + "\nAd: " + isim + "\nYaş: " + yas + "\nTC No: " + tcNo
                + "\nOkul No: " + okulNo);
    }
}