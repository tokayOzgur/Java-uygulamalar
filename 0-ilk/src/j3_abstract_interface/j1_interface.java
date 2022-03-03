package j3_abstract_interface;

public class j1_interface {
    public static void main(String[] args) {

    }
}

/**
 * Yenilebilir
 * Burada sadece metotların tanımı oluyor.
 * Kalıtım olmadan kullanılabilir
 */
interface Yenilebilir {

    void yenmeSeki();
}

class Elma implements Yenilebilir {

    @Override
    public void yenmeSeki() {
        // TODO Auto-generated method stub
        System.out.println("Elma yenildi.");
    }
}

class Inek implements Yenilebilir {

    @Override
    public void yenmeSeki() {
        // TODO Auto-generated method stub
        System.out.println("İnek yenildi.");
    }
}