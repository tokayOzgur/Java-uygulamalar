package j2_oop;

public class oop0_ogrenci {

    private int ogrId;
    private String ogrIsim;
    private byte sinif;
    private boolean aktifMi;

    

    public oop0_ogrenci() {
        super();
    }

    public oop0_ogrenci(int ogrId, String ogrIsim, byte sinif, boolean aktifMi) {
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
