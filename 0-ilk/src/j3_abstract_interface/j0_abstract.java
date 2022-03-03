package j3_abstract_interface;

public class j0_abstract {
    public static void main(String[] args) {

    }
}

abstract class GeometrikSekil {
    private int birinciKenar;

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }

    // metods
    abstract  public void alanHesapla();

    abstract public void cevreHesapla();

}

class Kare extends GeometrikSekil {

    @Override
    public void alanHesapla() {
        // TODO Auto-generated method stub
        System.out.println(Math.pow(getBirinciKenar(), 2));
    }

    @Override
    public void cevreHesapla() {
        // TODO Auto-generated method stub
        System.out.println(getBirinciKenar() * 4);
    }
}

class Dikdortgen extends GeometrikSekil {
    private int ikinciKenar;

    @Override
    public void alanHesapla() {
        System.out.println((getBirinciKenar() * getIkinciKenar()));
    }

    @Override
    public void cevreHesapla() {
        // TODO Auto-generated method stub
        System.out.println((getBirinciKenar() + getIkinciKenar()) * 2);
    }

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }

}
