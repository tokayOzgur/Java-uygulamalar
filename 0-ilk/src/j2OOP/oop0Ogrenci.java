package j2Oop;

public class oop0Ogrenci {

    private int ogrId;
    private String ogrIsim;
    private byte sinif;
    private boolean aktifMi;

    

    public oop0Ogrenci() {
        super();
    }

    public oop0Ogrenci(int ogrId, String ogrIsim, byte sinif, boolean aktifMi) {
        this.ogrId = ogrId;
        this.ogrIsim = ogrIsim;
        this.sinif = sinif;
        this.aktifMi = aktifMi;
    }

    public void ogrBigileriniYazdir() {
        if (aktifMi)
            System.out.println("\nÖğrenci Id: " + ogrId + "\nİsim: " + ogrIsim + "\nSınıf: " + sinif);
    }

}
