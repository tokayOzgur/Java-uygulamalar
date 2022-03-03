package j3_abstract_interface;

import java.util.Arrays;

public class j3_comparable {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci(1, "Özgür Tokay");
        Ogrenci ogr2 = new Ogrenci(2, "Hasan");
        Ogrenci ogr3 = new Ogrenci(3, "Ali ");

        Ogrenci[] ogrencis = { ogr1, ogr2, ogr3 };

        System.out.println("Dizinin sıralanmadan önceki hali: ");
        for (Ogrenci ogrenci : ogrencis) {
            System.out.println(ogrenci);
        }

        System.out.println("Sıralanmış hali: ");
        Arrays.sort(ogrencis);
        for (Ogrenci ogrenci : ogrencis) {
            System.out.println(ogrenci);
        }
    }
}

class Ogrenci implements Comparable<Ogrenci> {
    int id;
    String ad;

    public Ogrenci(int id, String ad) {
        this.ad = ad;
        this.id = id;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\nad: " + ad + "\nid: " + id;
    }

    @Override
    public int compareTo(Ogrenci o) {
        // TODO Auto-generated method stub
        // id değerine göre sıralama
        /*
         * if (this.id < o.id)// Küçükse
         * return -1;
         * else if (this.id > o.id) // Büyükse
         * return 1;
         * else // Eşitse
         * return 0;
         */

        // isme göre sıralama
        if (this.ad.compareTo(o.ad) < 0) {
            return -1;
        } else if (this.ad.compareTo(o.ad) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}